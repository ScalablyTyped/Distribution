package typings.chrome.anon

import typings.chrome.chrome.topSites.MostVisitedURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoftopSites extends js.Object {
  def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit = js.native
}

object TypeoftopSites {
  @scala.inline
  def apply(get: js.Function1[/* data */ js.Array[MostVisitedURL], Unit] => Unit): TypeoftopSites = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[TypeoftopSites]
  }
  @scala.inline
  implicit class TypeoftopSitesOps[Self <: TypeoftopSites] (val x: Self) extends AnyVal {
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
    def setGet(value: js.Function1[/* data */ js.Array[MostVisitedURL], Unit] => Unit): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

