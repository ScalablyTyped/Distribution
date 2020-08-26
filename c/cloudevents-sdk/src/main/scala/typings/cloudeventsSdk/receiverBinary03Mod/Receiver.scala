package typings.cloudeventsSdk.receiverBinary03Mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import typings.cloudeventsSdk.anon.Dictx
import typings.cloudeventsSdk.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Receiver extends js.Object {
  var Spec: Instantiable0[typings.cloudeventsSdk.spec03Mod.^] = js.native
  var allowedContentTypes: js.Array[_] = js.native
  var extensionsPrefix: js.Any = js.native
  var parsersByEncoding: Dictx = js.native
  var requiredHeaders: js.Array[_] = js.native
  var setterByHeader: NumberDictionary[Name] = js.native
  var spec: typings.cloudeventsSdk.spec03Mod.^ = js.native
  var specversion: js.Any = js.native
}

object Receiver {
  @scala.inline
  def apply(
    Spec: Instantiable0[typings.cloudeventsSdk.spec03Mod.^],
    allowedContentTypes: js.Array[_],
    extensionsPrefix: js.Any,
    parsersByEncoding: Dictx,
    requiredHeaders: js.Array[_],
    setterByHeader: NumberDictionary[Name],
    spec: typings.cloudeventsSdk.spec03Mod.^,
    specversion: js.Any
  ): Receiver = {
    val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], allowedContentTypes = allowedContentTypes.asInstanceOf[js.Any], extensionsPrefix = extensionsPrefix.asInstanceOf[js.Any], parsersByEncoding = parsersByEncoding.asInstanceOf[js.Any], requiredHeaders = requiredHeaders.asInstanceOf[js.Any], setterByHeader = setterByHeader.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], specversion = specversion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receiver]
  }
  @scala.inline
  implicit class ReceiverOps[Self <: Receiver] (val x: Self) extends AnyVal {
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
    def setSpec(value: Instantiable0[typings.cloudeventsSdk.spec03Mod.^]): Self = this.set("Spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedContentTypesVarargs(value: js.Any*): Self = this.set("allowedContentTypes", js.Array(value :_*))
    @scala.inline
    def setAllowedContentTypes(value: js.Array[_]): Self = this.set("allowedContentTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionsPrefix(value: js.Any): Self = this.set("extensionsPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsersByEncoding(value: Dictx): Self = this.set("parsersByEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredHeadersVarargs(value: js.Any*): Self = this.set("requiredHeaders", js.Array(value :_*))
    @scala.inline
    def setRequiredHeaders(value: js.Array[_]): Self = this.set("requiredHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetterByHeader(value: NumberDictionary[Name]): Self = this.set("setterByHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecversion(value: js.Any): Self = this.set("specversion", value.asInstanceOf[js.Any])
  }
  
}

