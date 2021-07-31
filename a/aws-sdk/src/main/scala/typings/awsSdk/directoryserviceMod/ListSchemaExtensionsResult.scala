package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemaExtensionsResult extends StObject {
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListSchemaExtensions to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.undefined
  
  /**
    * Information about the schema extensions applied to the directory.
    */
  var SchemaExtensionsInfo: js.UndefOr[typings.awsSdk.directoryserviceMod.SchemaExtensionsInfo] = js.undefined
}
object ListSchemaExtensionsResult {
  
  @scala.inline
  def apply(): ListSchemaExtensionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemaExtensionsResult]
  }
  
  @scala.inline
  implicit class ListSchemaExtensionsResultMutableBuilder[Self <: ListSchemaExtensionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSchemaExtensionsInfo(value: SchemaExtensionsInfo): Self = StObject.set(x, "SchemaExtensionsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaExtensionsInfoUndefined: Self = StObject.set(x, "SchemaExtensionsInfo", js.undefined)
    
    @scala.inline
    def setSchemaExtensionsInfoVarargs(value: SchemaExtensionInfo*): Self = StObject.set(x, "SchemaExtensionsInfo", js.Array(value :_*))
  }
}
