package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2SecurityGroupPrefixListId extends StObject {
  
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2SecurityGroupPrefixListId {
  
  inline def apply(): AwsEc2SecurityGroupPrefixListId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupPrefixListId]
  }
  
  extension [Self <: AwsEc2SecurityGroupPrefixListId](x: Self) {
    
    inline def setPrefixListId(value: NonEmptyString): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
  }
}
