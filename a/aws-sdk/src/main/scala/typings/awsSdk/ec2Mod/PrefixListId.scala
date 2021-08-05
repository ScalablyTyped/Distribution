package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixListId extends StObject {
  
  /**
    * A description for the security group rule that references this prefix list ID. Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=;{}!$*
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[String] = js.undefined
}
object PrefixListId {
  
  inline def apply(): PrefixListId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixListId]
  }
  
  extension [Self <: PrefixListId](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setPrefixListId(value: String): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
  }
}
