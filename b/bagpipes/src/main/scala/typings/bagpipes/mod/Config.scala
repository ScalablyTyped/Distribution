package typings.bagpipes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config
  extends /* prop */ StringDictionary[js.Any] {
  var connectMiddlewareDirs: js.UndefOr[js.Array[String]] = js.native
  var userFittingsDirs: js.UndefOr[js.Array[String]] = js.native
  var userViewsDirs: js.UndefOr[js.Array[String]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setConnectMiddlewareDirsVarargs(value: String*): Self = this.set("connectMiddlewareDirs", js.Array(value :_*))
    @scala.inline
    def setConnectMiddlewareDirs(value: js.Array[String]): Self = this.set("connectMiddlewareDirs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectMiddlewareDirs: Self = this.set("connectMiddlewareDirs", js.undefined)
    @scala.inline
    def setUserFittingsDirsVarargs(value: String*): Self = this.set("userFittingsDirs", js.Array(value :_*))
    @scala.inline
    def setUserFittingsDirs(value: js.Array[String]): Self = this.set("userFittingsDirs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserFittingsDirs: Self = this.set("userFittingsDirs", js.undefined)
    @scala.inline
    def setUserViewsDirsVarargs(value: String*): Self = this.set("userViewsDirs", js.Array(value :_*))
    @scala.inline
    def setUserViewsDirs(value: js.Array[String]): Self = this.set("userViewsDirs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserViewsDirs: Self = this.set("userViewsDirs", js.undefined)
  }
  
}

