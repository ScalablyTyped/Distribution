package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharacterSet extends StObject {
  
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
  implicit class CharacterSetMutableBuilder[Self <: CharacterSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacterSetDescription(value: String): Self = StObject.set(x, "CharacterSetDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterSetDescriptionUndefined: Self = StObject.set(x, "CharacterSetDescription", js.undefined)
    
    @scala.inline
    def setCharacterSetName(value: String): Self = StObject.set(x, "CharacterSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterSetNameUndefined: Self = StObject.set(x, "CharacterSetName", js.undefined)
  }
}
