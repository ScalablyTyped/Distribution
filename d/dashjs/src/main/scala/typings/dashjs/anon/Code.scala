package typings.dashjs.anon

import typings.dashjs.dashjsNumbers.`100`
import typings.dashjs.dashjsNumbers.`101`
import typings.dashjs.dashjsNumbers.`102`
import typings.dashjs.dashjsNumbers.`103`
import typings.dashjs.dashjsNumbers.`104`
import typings.dashjs.dashjsNumbers.`105`
import typings.dashjs.dashjsNumbers.`106`
import typings.dashjs.dashjsNumbers.`107`
import typings.dashjs.dashjsNumbers.`108`
import typings.dashjs.dashjsNumbers.`109`
import typings.dashjs.dashjsNumbers.`10`
import typings.dashjs.dashjsNumbers.`110`
import typings.dashjs.dashjsNumbers.`111`
import typings.dashjs.dashjsNumbers.`112`
import typings.dashjs.dashjsNumbers.`113`
import typings.dashjs.dashjsNumbers.`114`
import typings.dashjs.dashjsNumbers.`11`
import typings.dashjs.dashjsNumbers.`12`
import typings.dashjs.dashjsNumbers.`13`
import typings.dashjs.dashjsNumbers.`14`
import typings.dashjs.dashjsNumbers.`15`
import typings.dashjs.dashjsNumbers.`16`
import typings.dashjs.dashjsNumbers.`17`
import typings.dashjs.dashjsNumbers.`18`
import typings.dashjs.dashjsNumbers.`19`
import typings.dashjs.dashjsNumbers.`200`
import typings.dashjs.dashjsNumbers.`20`
import typings.dashjs.dashjsNumbers.`21`
import typings.dashjs.dashjsNumbers.`22`
import typings.dashjs.dashjsNumbers.`23`
import typings.dashjs.dashjsNumbers.`24`
import typings.dashjs.dashjsNumbers.`25`
import typings.dashjs.dashjsNumbers.`27`
import typings.dashjs.dashjsNumbers.`28`
import typings.dashjs.dashjsNumbers.`29`
import typings.dashjs.dashjsNumbers.`31`
import typings.dashjs.dashjsNumbers.`32`
import typings.dashjs.dashjsNumbers.`33`
import typings.dashjs.dashjsNumbers.`34`
import typings.dashjs.dashjsNumbers.`35`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Code extends js.Object {
  
  var code: `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` | `24` | `25` | `27` | `28` | `29` | `31` | `32` | `33` | `34` | `35` | `100` | `101` | `102` | `103` | `104` | `105` | `106` | `107` | `108` | `109` | `110` | `111` | `112` | `113` | `114` | `200` = js.native
  
  var data: js.Object = js.native
  
  var message: String = js.native
}
object Code {
  
  @scala.inline
  def apply(
    code: `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` | `24` | `25` | `27` | `28` | `29` | `31` | `32` | `33` | `34` | `35` | `100` | `101` | `102` | `103` | `104` | `105` | `106` | `107` | `108` | `109` | `110` | `111` | `112` | `113` | `114` | `200`,
    data: js.Object,
    message: String
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    
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
    def setCode(
      value: `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20` | `21` | `22` | `23` | `24` | `25` | `27` | `28` | `29` | `31` | `32` | `33` | `34` | `35` | `100` | `101` | `102` | `103` | `104` | `105` | `106` | `107` | `108` | `109` | `110` | `111` | `112` | `113` | `114` | `200`
    ): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
