package typings.baseui

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.anon.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overridesMod {
  
  @JSImport("baseui/helpers/overrides", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOverride(_override: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverride")(_override.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getOverrideProps[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverrideProps")().asInstanceOf[T]
  inline def getOverrideProps[T](_override: Override[Any]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverrideProps")(_override.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getOverrides[T](_override: Any, defaultComponent: ComponentType[Any]): js.Tuple2[ComponentType[Any], T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverrides")(_override.asInstanceOf[js.Any], defaultComponent.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ComponentType[Any], T]]
  
  inline def mergeConfigurationOverrides(target: ConfigurationOverride, source: ConfigurationOverride): ConfigurationOverride = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfigurationOverrides")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ConfigurationOverride]
  
  inline def mergeOverride(target: OverrideObject, source: OverrideObject): OverrideObject = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverride")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[OverrideObject]
  
  inline def mergeOverrides(): Overrides[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverrides")().asInstanceOf[Overrides[Any]]
  inline def mergeOverrides(target: Unit, source: Overrides[Any]): Overrides[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverrides")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Overrides[Any]]
  inline def mergeOverrides(target: Overrides[Any]): Overrides[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverrides")(target.asInstanceOf[js.Any]).asInstanceOf[Overrides[Any]]
  inline def mergeOverrides(target: Overrides[Any], source: Overrides[Any]): Overrides[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverrides")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Overrides[Any]]
  
  inline def toObjectOverride[T](): OverrideObject = ^.asInstanceOf[js.Dynamic].applyDynamic("toObjectOverride")().asInstanceOf[OverrideObject]
  inline def toObjectOverride[T](_override: Override[Any]): OverrideObject = ^.asInstanceOf[js.Dynamic].applyDynamic("toObjectOverride")(_override.asInstanceOf[js.Any]).asInstanceOf[OverrideObject]
  
  inline def useOverrides(defaults: StringDictionary[ComponentType[Any]]): StringDictionary[js.Tuple2[ComponentType[Any], js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverrides")(defaults.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Tuple2[ComponentType[Any], js.Object]]]
  inline def useOverrides(defaults: StringDictionary[ComponentType[Any]], overrides: Overrides[Any]): StringDictionary[js.Tuple2[ComponentType[Any], js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverrides")(defaults.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Tuple2[ComponentType[Any], js.Object]]]
  
  type ConfigurationOverride = ConfigurationOverrideObject | ConfigurationOverrideFunction
  
  type ConfigurationOverrideFunction = js.Function1[/* a */ Any, js.UndefOr[Any | Null]]
  
  type ConfigurationOverrideObject = StringDictionary[Any]
  
  type Override[T] = OverrideObject | (ComponentType[Any] & Component)
  
  trait OverrideObject extends StObject {
    
    var component: js.UndefOr[ComponentType[Any] | Null] = js.undefined
    
    var props: js.UndefOr[ConfigurationOverride | Null] = js.undefined
    
    var style: js.UndefOr[ConfigurationOverride | Null] = js.undefined
  }
  object OverrideObject {
    
    inline def apply(): OverrideObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverrideObject]
    }
    
    extension [Self <: OverrideObject](x: Self) {
      
      inline def setComponent(value: ComponentType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentNull: Self = StObject.set(x, "component", null)
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setProps(value: ConfigurationOverride): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsFunction1(value: /* a */ Any => js.UndefOr[Any | Null]): Self = StObject.set(x, "props", js.Any.fromFunction1(value))
      
      inline def setPropsNull: Self = StObject.set(x, "props", null)
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setStyle(value: ConfigurationOverride): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction1(value: /* a */ Any => js.UndefOr[Any | Null]): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type Overrides[T] = StringDictionary[Override[Any]]
  
  type StyleOverride = ConfigurationOverride
}
