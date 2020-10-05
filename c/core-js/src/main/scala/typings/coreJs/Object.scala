package typings.coreJs

import typings.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object extends js.Object {
  def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = js.native
}

object Object {
  @scala.inline
  def apply(getOwnPropertyDescriptors: js.Any => PropertyDescriptorMap): Object = {
    val __obj = js.Dynamic.literal(getOwnPropertyDescriptors = js.Any.fromFunction1(getOwnPropertyDescriptors))
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetOwnPropertyDescriptors(value: js.Any => PropertyDescriptorMap): Self = this.set("getOwnPropertyDescriptors", js.Any.fromFunction1(value))
  }
  
}

