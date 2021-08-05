package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixList extends StObject {
  
  /**
    * The IP address range of the AWS service.
    */
  var Cidrs: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the prefix.
    */
  var PrefixListName: js.UndefOr[String] = js.undefined
}
object PrefixList {
  
  inline def apply(): PrefixList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixList]
  }
  
  extension [Self <: PrefixList](x: Self) {
    
    inline def setCidrs(value: ValueStringList): Self = StObject.set(x, "Cidrs", value.asInstanceOf[js.Any])
    
    inline def setCidrsUndefined: Self = StObject.set(x, "Cidrs", js.undefined)
    
    inline def setCidrsVarargs(value: String*): Self = StObject.set(x, "Cidrs", js.Array(value :_*))
    
    inline def setPrefixListId(value: String): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    inline def setPrefixListName(value: String): Self = StObject.set(x, "PrefixListName", value.asInstanceOf[js.Any])
    
    inline def setPrefixListNameUndefined: Self = StObject.set(x, "PrefixListName", js.undefined)
  }
}
