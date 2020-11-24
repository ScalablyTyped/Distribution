package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharacterSet extends js.Object {
  
  /**
    * The description of the character set.
    */
  var CharacterSetDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the character set.
    */
  var CharacterSetName: js.UndefOr[String] = js.native
}
object CharacterSet {
  
  @scala.inline
  def apply(): CharacterSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CharacterSet]
  }
  
  @scala.inline
  implicit class CharacterSetOps[Self <: CharacterSet] (val x: Self) extends AnyVal {
    
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
    def setCharacterSetDescription(value: String): Self = this.set("CharacterSetDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterSetDescription: Self = this.set("CharacterSetDescription", js.undefined)
    
    @scala.inline
    def setCharacterSetName(value: String): Self = this.set("CharacterSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacterSetName: Self = this.set("CharacterSetName", js.undefined)
  }
}
