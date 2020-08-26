package typings.classTransformer.classTransformOptionsMod

import typings.classTransformer.classTransformerStrings.excludeAll
import typings.classTransformer.classTransformerStrings.exposeAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassTransformOptions extends js.Object {
  /**
    * If set to true then class transformer will perform a circular check. (circular check is turned off by default)
    * This option is useful when you know for sure that your types might have a circular dependency.
    */
  var enableCircularCheck: js.UndefOr[Boolean] = js.native
  /**
    * If set to true then class transformer will try to convert properties implicitly to their target type based on their typing information.
    *
    * DEFAULT: `false`
    */
  var enableImplicitConversion: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if extraneous properties should be excluded from the value when converting a plain value to a class.
    */
  var excludeExtraneousValues: js.UndefOr[Boolean] = js.native
  /**
    * Excludes properties with the given prefixes. For example, if you mark your private properties with "_" and "__"
    * you can set this option's value to ["_", "__"] and all private properties will be skipped.
    * This works only for "exposeAll" strategy.
    */
  var excludePrefixes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only properties with given groups gonna be transformed.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set to true then class transformer will ignore all @Expose and @Exclude decorators and what inside them.
    * This option is useful if you want to kinda clone your object but do not apply decorators affects.
    */
  var ignoreDecorators: js.UndefOr[Boolean] = js.native
  /**
    * Exclusion strategy. By default exposeAll is used, which means that it will expose all properties are transformed
    * by default.
    */
  var strategy: js.UndefOr[excludeAll | exposeAll] = js.native
  /**
    * Target maps allows to set a Types of the transforming object without using @Type decorator.
    * This is useful when you are transforming external classes, or if you already have type metadata for
    * objects and you don't want to set it up again.
    */
  var targetMaps: js.UndefOr[js.Array[TargetMap]] = js.native
  /**
    * Only properties with "since" > version < "until" gonna be transformed.
    */
  var version: js.UndefOr[Double] = js.native
}

object ClassTransformOptions {
  @scala.inline
  def apply(): ClassTransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassTransformOptions]
  }
  @scala.inline
  implicit class ClassTransformOptionsOps[Self <: ClassTransformOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnableCircularCheck(value: Boolean): Self = this.set("enableCircularCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCircularCheck: Self = this.set("enableCircularCheck", js.undefined)
    @scala.inline
    def setEnableImplicitConversion(value: Boolean): Self = this.set("enableImplicitConversion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableImplicitConversion: Self = this.set("enableImplicitConversion", js.undefined)
    @scala.inline
    def setExcludeExtraneousValues(value: Boolean): Self = this.set("excludeExtraneousValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeExtraneousValues: Self = this.set("excludeExtraneousValues", js.undefined)
    @scala.inline
    def setExcludePrefixesVarargs(value: String*): Self = this.set("excludePrefixes", js.Array(value :_*))
    @scala.inline
    def setExcludePrefixes(value: js.Array[String]): Self = this.set("excludePrefixes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludePrefixes: Self = this.set("excludePrefixes", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setIgnoreDecorators(value: Boolean): Self = this.set("ignoreDecorators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreDecorators: Self = this.set("ignoreDecorators", js.undefined)
    @scala.inline
    def setStrategy(value: excludeAll | exposeAll): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    @scala.inline
    def setTargetMapsVarargs(value: TargetMap*): Self = this.set("targetMaps", js.Array(value :_*))
    @scala.inline
    def setTargetMaps(value: js.Array[TargetMap]): Self = this.set("targetMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetMaps: Self = this.set("targetMaps", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

