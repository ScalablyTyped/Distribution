package typings.benchmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Support extends js.Object {
  var air: Boolean = js.native
  var argumentsClass: Boolean = js.native
  var browser: Boolean = js.native
  var charByIndex: Boolean = js.native
  var charByOwnIndex: Boolean = js.native
  var decompilation: Boolean = js.native
  var descriptors: Boolean = js.native
  var getAllKeys: Boolean = js.native
  var iteratesOwnFirst: Boolean = js.native
  @JSName("java")
  var java_ : Boolean = js.native
  var nodeClass: Boolean = js.native
  var timeout: Boolean = js.native
}

object Support {
  @scala.inline
  def apply(
    air: Boolean,
    argumentsClass: Boolean,
    browser: Boolean,
    charByIndex: Boolean,
    charByOwnIndex: Boolean,
    decompilation: Boolean,
    descriptors: Boolean,
    getAllKeys: Boolean,
    iteratesOwnFirst: Boolean,
    java_ : Boolean,
    nodeClass: Boolean,
    timeout: Boolean
  ): Support = {
    val __obj = js.Dynamic.literal(air = air.asInstanceOf[js.Any], argumentsClass = argumentsClass.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], charByIndex = charByIndex.asInstanceOf[js.Any], charByOwnIndex = charByOwnIndex.asInstanceOf[js.Any], decompilation = decompilation.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], getAllKeys = getAllKeys.asInstanceOf[js.Any], iteratesOwnFirst = iteratesOwnFirst.asInstanceOf[js.Any], nodeClass = nodeClass.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Support]
  }
  @scala.inline
  implicit class SupportOps[Self <: Support] (val x: Self) extends AnyVal {
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
    def setAir(value: Boolean): Self = this.set("air", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgumentsClass(value: Boolean): Self = this.set("argumentsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowser(value: Boolean): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharByIndex(value: Boolean): Self = this.set("charByIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharByOwnIndex(value: Boolean): Self = this.set("charByOwnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecompilation(value: Boolean): Self = this.set("decompilation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptors(value: Boolean): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAllKeys(value: Boolean): Self = this.set("getAllKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setIteratesOwnFirst(value: Boolean): Self = this.set("iteratesOwnFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setJava_(value: Boolean): Self = this.set("java", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeClass(value: Boolean): Self = this.set("nodeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Boolean): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

