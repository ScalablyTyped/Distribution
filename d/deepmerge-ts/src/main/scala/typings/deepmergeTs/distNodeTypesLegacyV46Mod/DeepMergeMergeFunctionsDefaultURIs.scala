package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default merge functions to use when deep merging.
  */
/* Inlined std.Readonly<{  DeepMergeRecordsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeRecordsDefaultURI,   DeepMergeArraysURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeArraysDefaultURI,   DeepMergeSetsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeSetsDefaultURI,   DeepMergeMapsURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeMapsDefaultURI,   DeepMergeOthersURI :deepmerge-ts.deepmerge-ts/dist/node/types/legacy/v4_6.DeepMergeLeafURI}> */
trait DeepMergeMergeFunctionsDefaultURIs extends StObject {
  
  val DeepMergeArraysURI: DeepMergeArraysDefaultURI
  
  val DeepMergeMapsURI: DeepMergeMapsDefaultURI
  
  val DeepMergeOthersURI: DeepMergeLeafURI
  
  val DeepMergeRecordsURI: DeepMergeRecordsDefaultURI
  
  val DeepMergeSetsURI: DeepMergeSetsDefaultURI
}
object DeepMergeMergeFunctionsDefaultURIs {
  
  inline def apply(
    DeepMergeArraysURI: DeepMergeArraysDefaultURI,
    DeepMergeMapsURI: DeepMergeMapsDefaultURI,
    DeepMergeOthersURI: DeepMergeLeafURI,
    DeepMergeRecordsURI: DeepMergeRecordsDefaultURI,
    DeepMergeSetsURI: DeepMergeSetsDefaultURI
  ): DeepMergeMergeFunctionsDefaultURIs = {
    val __obj = js.Dynamic.literal(DeepMergeArraysURI = DeepMergeArraysURI.asInstanceOf[js.Any], DeepMergeMapsURI = DeepMergeMapsURI.asInstanceOf[js.Any], DeepMergeOthersURI = DeepMergeOthersURI.asInstanceOf[js.Any], DeepMergeRecordsURI = DeepMergeRecordsURI.asInstanceOf[js.Any], DeepMergeSetsURI = DeepMergeSetsURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepMergeMergeFunctionsDefaultURIs]
  }
  
  extension [Self <: DeepMergeMergeFunctionsDefaultURIs](x: Self) {
    
    inline def setDeepMergeArraysURI(value: DeepMergeArraysDefaultURI): Self = StObject.set(x, "DeepMergeArraysURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeMapsURI(value: DeepMergeMapsDefaultURI): Self = StObject.set(x, "DeepMergeMapsURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeOthersURI(value: DeepMergeLeafURI): Self = StObject.set(x, "DeepMergeOthersURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeRecordsURI(value: DeepMergeRecordsDefaultURI): Self = StObject.set(x, "DeepMergeRecordsURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeSetsURI(value: DeepMergeSetsDefaultURI): Self = StObject.set(x, "DeepMergeSetsURI", value.asInstanceOf[js.Any])
  }
}
