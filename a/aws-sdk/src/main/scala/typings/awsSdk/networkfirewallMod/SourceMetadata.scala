package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule group that your own rule group is copied from.
    */
  var SourceArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The update token of the Amazon Web Services managed rule group that your own rule group is copied from. To determine the update token for the managed rule group, call DescribeRuleGroup.
    */
  var SourceUpdateToken: js.UndefOr[UpdateToken] = js.undefined
}
object SourceMetadata {
  
  inline def apply(): SourceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMetadata]
  }
  
  extension [Self <: SourceMetadata](x: Self) {
    
    inline def setSourceArn(value: ResourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setSourceUpdateToken(value: UpdateToken): Self = StObject.set(x, "SourceUpdateToken", value.asInstanceOf[js.Any])
    
    inline def setSourceUpdateTokenUndefined: Self = StObject.set(x, "SourceUpdateToken", js.undefined)
  }
}
