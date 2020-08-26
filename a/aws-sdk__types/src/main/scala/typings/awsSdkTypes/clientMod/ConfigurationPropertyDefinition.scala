package typings.awsSdkTypes.clientMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationPropertyDefinition[InputType, ResolvedType /* <: InputType */, ServiceConfiguration /* <: StringDictionary[js.Any] */, ResolvedConfiguration /* <: ServiceConfiguration */] extends js.Object {
  /**
    * A function that finalizes the value supplied and/or alters the client
    * configuration or middleware stack in reaction to it.
    */
  @JSName("apply")
  var apply: js.UndefOr[ConfigApplicator[ResolvedConfiguration]] = js.native
  /**
    * A function that returns a default value for this property. It will be
    * called if no value is supplied.
    */
  var defaultProvider: js.UndefOr[js.Function1[/* config */ ResolvedConfiguration, ResolvedType]] = js.native
  /**
    * A static value to use as the default should none be supplied.
    */
  var defaultValue: js.UndefOr[ResolvedType] = js.native
  /**
    * A function that normalizes input to the subtype expected by the SDK.
    */
  var normalize: js.UndefOr[
    js.Function2[/* value */ InputType, /* config */ Partial[ResolvedConfiguration], ResolvedType]
  ] = js.native
  /**
    * Whether this property must be supplied by the user of a client. If value
    * must be resolved but a default is available, this property should be
    * `false` or undefined.
    */
  var required: js.UndefOr[Boolean] = js.native
}

object ConfigurationPropertyDefinition {
  @scala.inline
  def apply[InputType, /* <: InputType */ ResolvedType, /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ ServiceConfiguration, /* <: ServiceConfiguration */ ResolvedConfiguration](): ConfigurationPropertyDefinition[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationPropertyDefinition[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration]]
  }
  @scala.inline
  implicit class ConfigurationPropertyDefinitionOps[Self <: ConfigurationPropertyDefinition[_, _, _, _], InputType, /* <: InputType */ ResolvedType, /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */ ServiceConfiguration, /* <: ServiceConfiguration */ ResolvedConfiguration] (val x: Self with (ConfigurationPropertyDefinition[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration])) extends AnyVal {
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
    def setApply(
      value: (ResolvedConfiguration, /* clientMiddlewareStack */ MiddlewareStack[js.Any, js.Any, js.Any]) => Unit
    ): Self = this.set("apply", js.Any.fromFunction2(value))
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    @scala.inline
    def setDefaultProvider(value: /* config */ ResolvedConfiguration => ResolvedType): Self = this.set("defaultProvider", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDefaultProvider: Self = this.set("defaultProvider", js.undefined)
    @scala.inline
    def setDefaultValue(value: ResolvedType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setNormalize(value: (/* value */ InputType, /* config */ Partial[ResolvedConfiguration]) => ResolvedType): Self = this.set("normalize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

