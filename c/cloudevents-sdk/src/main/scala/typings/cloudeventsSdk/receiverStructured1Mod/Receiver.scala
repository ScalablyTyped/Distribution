package typings.cloudeventsSdk.receiverStructured1Mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Receiver extends js.Object {
  var Spec: Instantiable0[typings.cloudeventsSdk.spec1Mod.^] = js.native
  var allowedContentTypes: js.Array[_] = js.native
  var parserByMime: NumberDictionary[js.Any] = js.native
  var parserMap: Map[_, _] = js.native
  var spec: typings.cloudeventsSdk.spec1Mod.^ = js.native
}

object Receiver {
  @scala.inline
  def apply(
    Spec: Instantiable0[typings.cloudeventsSdk.spec1Mod.^],
    allowedContentTypes: js.Array[_],
    parserByMime: NumberDictionary[js.Any],
    parserMap: Map[_, _],
    spec: typings.cloudeventsSdk.spec1Mod.^
  ): Receiver = {
    val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], allowedContentTypes = allowedContentTypes.asInstanceOf[js.Any], parserByMime = parserByMime.asInstanceOf[js.Any], parserMap = parserMap.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
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
    def setSpec(value: Instantiable0[typings.cloudeventsSdk.spec1Mod.^]): Self = this.set("Spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedContentTypesVarargs(value: js.Any*): Self = this.set("allowedContentTypes", js.Array(value :_*))
    @scala.inline
    def setAllowedContentTypes(value: js.Array[_]): Self = this.set("allowedContentTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setParserByMime(value: NumberDictionary[js.Any]): Self = this.set("parserByMime", value.asInstanceOf[js.Any])
    @scala.inline
    def setParserMap(value: Map[_, _]): Self = this.set("parserMap", value.asInstanceOf[js.Any])
  }
  
}

