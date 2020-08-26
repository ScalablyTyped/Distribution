package typings.bumpRegex.mod

import typings.bumpRegex.bumpRegexStrings.major
import typings.bumpRegex.bumpRegexStrings.minor
import typings.bumpRegex.bumpRegexStrings.patch
import typings.bumpRegex.bumpRegexStrings.prerelease
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var `case`: js.UndefOr[Boolean] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
  var preid: js.UndefOr[String] = js.native
  var regex: js.UndefOr[RegExp] = js.native
  var str: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[major | minor | patch | prerelease] = js.native
  var version: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCase(value: Boolean): Self = this.set("case", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCase: Self = this.set("case", js.undefined)
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setPreid(value: String): Self = this.set("preid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreid: Self = this.set("preid", js.undefined)
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    @scala.inline
    def setStr(value: String): Self = this.set("str", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStr: Self = this.set("str", js.undefined)
    @scala.inline
    def setType(value: major | minor | patch | prerelease): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

