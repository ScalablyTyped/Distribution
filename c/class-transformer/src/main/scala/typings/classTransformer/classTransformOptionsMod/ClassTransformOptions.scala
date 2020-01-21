package typings.classTransformer.classTransformOptionsMod

import typings.classTransformer.classTransformerStrings.excludeAll
import typings.classTransformer.classTransformerStrings.exposeAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassTransformOptions extends js.Object {
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
    */
  var excludeExtraneousValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Excludes properties with the given prefixes. For example, if you mark your private properties with "_" and "__"
    * you can set this option's value to ["_", "__"] and all private properties will be skipped.
    * This works only for "exposeAll" strategy.
    */
  var excludePrefixes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Only properties with given groups gonna be transformed.
    */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If set to true then class transformer will ignore all @Expose and @Exclude decorators and what inside them.
    * This option is useful if you want to kinda clone your object but do not apply decorators affects.
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
  @scala.inline
  def apply(
    enableCircularCheck: js.UndefOr[Boolean] = js.undefined,
    enableImplicitConversion: js.UndefOr[Boolean] = js.undefined,
    excludeExtraneousValues: js.UndefOr[Boolean] = js.undefined,
    excludePrefixes: js.Array[String] = null,
    groups: js.Array[String] = null,
    ignoreDecorators: js.UndefOr[Boolean] = js.undefined,
    strategy: excludeAll | exposeAll = null,
    targetMaps: js.Array[TargetMap] = null,
    version: Int | Double = null
  ): ClassTransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableCircularCheck)) __obj.updateDynamic("enableCircularCheck")(enableCircularCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(enableImplicitConversion)) __obj.updateDynamic("enableImplicitConversion")(enableImplicitConversion.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeExtraneousValues)) __obj.updateDynamic("excludeExtraneousValues")(excludeExtraneousValues.asInstanceOf[js.Any])
    if (excludePrefixes != null) __obj.updateDynamic("excludePrefixes")(excludePrefixes.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDecorators)) __obj.updateDynamic("ignoreDecorators")(ignoreDecorators.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (targetMaps != null) __obj.updateDynamic("targetMaps")(targetMaps.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassTransformOptions]
  }
}

