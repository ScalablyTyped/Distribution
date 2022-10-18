package typings.classTransformer

import typings.classTransformer.classTransformerStrings.excludeAll
import typings.classTransformer.classTransformerStrings.exposeAll
import typings.classTransformer.typesInterfacesTargetMapDotinterfaceMod.TargetMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfacesClassTransformerOptionsDotinterfaceMod {
  
  trait ClassTransformOptions extends StObject {
    
    /**
      * If set to true then class transformer will perform a circular check. (circular check is turned off by default)
      * This option is useful when you know for sure that your types might have a circular dependency.
      */
    var enableCircularCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true then class transformer will try to convert properties implicitly to their target type based on their typing information.
      *
      * DEFAULT: `false`
      */
    var enableImplicitConversion: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if extraneous properties should be excluded from the value when converting a plain value to a class.
      *
      * This option requires that each property on the target class has at least one `@Expose` or `@Exclude` decorator
      * assigned from this library.
      */
    var excludeExtraneousValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Excludes properties with the given prefixes. For example, if you mark your private properties with "_" and "__"
      * you can set this option's value to ["_", "__"] and all private properties will be skipped.
      * This works only for "exposeAll" strategy.
      */
    var excludePrefixes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If set to true then class transformer will take default values for unprovided fields.
      * This is useful when you convert a plain object to a class and have an optional field with a default value.
      */
    var exposeDefaultValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to true, fields with `undefined` as value will be included in class to plain transformation. Otherwise
      * those fields will be omitted from the result.
      *
      * DEFAULT: `true`
      */
    var exposeUnsetFields: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only properties with given groups gonna be transformed.
      */
    var groups: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If set to true then class transformer will ignore the effect of all @Expose and @Exclude decorators.
      * This option is useful if you want to kinda clone your object but do not apply decorators affects.
      *
      * __NOTE:__ You may still have to add the decorators to make other options work.
      */
    var ignoreDecorators: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Exclusion strategy. By default exposeAll is used, which means that it will expose all properties are transformed
      * by default.
      */
    var strategy: js.UndefOr[excludeAll | exposeAll] = js.undefined
    
    /**
      * Target maps allows to set a Types of the transforming object without using @Type decorator.
      * This is useful when you are transforming external classes, or if you already have type metadata for
      * objects and you don't want to set it up again.
      */
    var targetMaps: js.UndefOr[js.Array[TargetMap]] = js.undefined
    
    /**
      * Only properties with "since" > version < "until" gonna be transformed.
      */
    var version: js.UndefOr[Double] = js.undefined
  }
  object ClassTransformOptions {
    
    inline def apply(): ClassTransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassTransformOptions]
    }
    
    extension [Self <: ClassTransformOptions](x: Self) {
      
      inline def setEnableCircularCheck(value: Boolean): Self = StObject.set(x, "enableCircularCheck", value.asInstanceOf[js.Any])
      
      inline def setEnableCircularCheckUndefined: Self = StObject.set(x, "enableCircularCheck", js.undefined)
      
      inline def setEnableImplicitConversion(value: Boolean): Self = StObject.set(x, "enableImplicitConversion", value.asInstanceOf[js.Any])
      
      inline def setEnableImplicitConversionUndefined: Self = StObject.set(x, "enableImplicitConversion", js.undefined)
      
      inline def setExcludeExtraneousValues(value: Boolean): Self = StObject.set(x, "excludeExtraneousValues", value.asInstanceOf[js.Any])
      
      inline def setExcludeExtraneousValuesUndefined: Self = StObject.set(x, "excludeExtraneousValues", js.undefined)
      
      inline def setExcludePrefixes(value: js.Array[String]): Self = StObject.set(x, "excludePrefixes", value.asInstanceOf[js.Any])
      
      inline def setExcludePrefixesUndefined: Self = StObject.set(x, "excludePrefixes", js.undefined)
      
      inline def setExcludePrefixesVarargs(value: String*): Self = StObject.set(x, "excludePrefixes", js.Array(value*))
      
      inline def setExposeDefaultValues(value: Boolean): Self = StObject.set(x, "exposeDefaultValues", value.asInstanceOf[js.Any])
      
      inline def setExposeDefaultValuesUndefined: Self = StObject.set(x, "exposeDefaultValues", js.undefined)
      
      inline def setExposeUnsetFields(value: Boolean): Self = StObject.set(x, "exposeUnsetFields", value.asInstanceOf[js.Any])
      
      inline def setExposeUnsetFieldsUndefined: Self = StObject.set(x, "exposeUnsetFields", js.undefined)
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setIgnoreDecorators(value: Boolean): Self = StObject.set(x, "ignoreDecorators", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDecoratorsUndefined: Self = StObject.set(x, "ignoreDecorators", js.undefined)
      
      inline def setStrategy(value: excludeAll | exposeAll): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setTargetMaps(value: js.Array[TargetMap]): Self = StObject.set(x, "targetMaps", value.asInstanceOf[js.Any])
      
      inline def setTargetMapsUndefined: Self = StObject.set(x, "targetMaps", js.undefined)
      
      inline def setTargetMapsVarargs(value: TargetMap*): Self = StObject.set(x, "targetMaps", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
