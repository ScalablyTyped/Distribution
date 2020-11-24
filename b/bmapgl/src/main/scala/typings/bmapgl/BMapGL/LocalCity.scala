package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalCity extends js.Object {
  
  def get(callback: js.Function1[/* result */ LocalCityResult, Unit]): Unit = js.native
}
object LocalCity {
  
  @scala.inline
  def apply(get: js.Function1[/* result */ LocalCityResult, Unit] => Unit): LocalCity = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[LocalCity]
  }
  
  @scala.inline
  implicit class LocalCityOps[Self <: LocalCity] (val x: Self) extends AnyVal {
    
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
    def setGet(value: js.Function1[/* result */ LocalCityResult, Unit] => Unit): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
