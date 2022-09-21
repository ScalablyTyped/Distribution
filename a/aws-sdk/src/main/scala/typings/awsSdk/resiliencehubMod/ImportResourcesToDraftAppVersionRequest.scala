package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportResourcesToDraftAppVersionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
  
  /**
    * The Amazon Resource Names (ARNs) for the resources that you want to import.
    */
  var sourceArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    *  A list of terraform file s3 URLs you need to import. 
    */
  var terraformSources: js.UndefOr[TerraformSourceList] = js.undefined
}
object ImportResourcesToDraftAppVersionRequest {
  
  inline def apply(appArn: Arn): ImportResourcesToDraftAppVersionRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportResourcesToDraftAppVersionRequest]
  }
  
  extension [Self <: ImportResourcesToDraftAppVersionRequest](x: Self) {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArns(value: ArnList): Self = StObject.set(x, "sourceArns", value.asInstanceOf[js.Any])
    
    inline def setSourceArnsUndefined: Self = StObject.set(x, "sourceArns", js.undefined)
    
    inline def setSourceArnsVarargs(value: Arn*): Self = StObject.set(x, "sourceArns", js.Array(value*))
    
    inline def setTerraformSources(value: TerraformSourceList): Self = StObject.set(x, "terraformSources", value.asInstanceOf[js.Any])
    
    inline def setTerraformSourcesUndefined: Self = StObject.set(x, "terraformSources", js.undefined)
    
    inline def setTerraformSourcesVarargs(value: TerraformSource*): Self = StObject.set(x, "terraformSources", js.Array(value*))
  }
}
