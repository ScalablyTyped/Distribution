package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The merge functions to use when deep merging.
  */
/* Inlined std.Readonly<{  DeepMergeRecordsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURIs,   DeepMergeArraysURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURIs,   DeepMergeSetsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURIs,   DeepMergeMapsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURIs,   DeepMergeOthersURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMergeFunctionURIs}> */
trait DeepMergeMergeFunctionsURIs extends StObject {
  
  val DeepMergeArraysURI: DeepMergeMergeFunctionURIs
  
  val DeepMergeMapsURI: DeepMergeMergeFunctionURIs
  
  val DeepMergeOthersURI: DeepMergeMergeFunctionURIs
  
  val DeepMergeRecordsURI: DeepMergeMergeFunctionURIs
  
  val DeepMergeSetsURI: DeepMergeMergeFunctionURIs
}
object DeepMergeMergeFunctionsURIs {
  
  inline def apply(
    DeepMergeArraysURI: DeepMergeMergeFunctionURIs,
    DeepMergeMapsURI: DeepMergeMergeFunctionURIs,
    DeepMergeOthersURI: DeepMergeMergeFunctionURIs,
    DeepMergeRecordsURI: DeepMergeMergeFunctionURIs,
    DeepMergeSetsURI: DeepMergeMergeFunctionURIs
  ): DeepMergeMergeFunctionsURIs = {
    val __obj = js.Dynamic.literal(DeepMergeArraysURI = DeepMergeArraysURI.asInstanceOf[js.Any], DeepMergeMapsURI = DeepMergeMapsURI.asInstanceOf[js.Any], DeepMergeOthersURI = DeepMergeOthersURI.asInstanceOf[js.Any], DeepMergeRecordsURI = DeepMergeRecordsURI.asInstanceOf[js.Any], DeepMergeSetsURI = DeepMergeSetsURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepMergeMergeFunctionsURIs]
  }
  
  extension [Self <: DeepMergeMergeFunctionsURIs](x: Self) {
    
    inline def setDeepMergeArraysURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeArraysURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeMapsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeMapsURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeOthersURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeOthersURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeRecordsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeRecordsURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeSetsURI(value: DeepMergeMergeFunctionURIs): Self = StObject.set(x, "DeepMergeSetsURI", value.asInstanceOf[js.Any])
  }
}
