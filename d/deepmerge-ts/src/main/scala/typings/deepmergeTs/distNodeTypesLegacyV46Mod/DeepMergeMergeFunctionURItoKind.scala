package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mapping of merge function URIs to the merge function type.
  */
trait DeepMergeMergeFunctionURItoKind[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M] extends StObject {
  
  val DeepMergeArraysDefaultURI: DeepMergeArraysDefaultHKT[Ts, MF, M]
  
  val DeepMergeLeafURI: DeepMergeLeaf[Ts]
  
  val DeepMergeMapsDefaultURI: DeepMergeMapsDefaultHKT[Ts]
  
  val DeepMergeRecordsDefaultURI: DeepMergeRecordsDefaultHKT[Ts, MF, M]
  
  val DeepMergeSetsDefaultURI: DeepMergeSetsDefaultHKT[Ts]
}
object DeepMergeMergeFunctionURItoKind {
  
  inline def apply[Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M](
    DeepMergeArraysDefaultURI: DeepMergeArraysDefaultHKT[Ts, MF, M],
    DeepMergeLeafURI: DeepMergeLeaf[Ts],
    DeepMergeMapsDefaultURI: DeepMergeMapsDefaultHKT[Ts],
    DeepMergeRecordsDefaultURI: DeepMergeRecordsDefaultHKT[Ts, MF, M],
    DeepMergeSetsDefaultURI: DeepMergeSetsDefaultHKT[Ts]
  ): DeepMergeMergeFunctionURItoKind[Ts, MF, M] = {
    val __obj = js.Dynamic.literal(DeepMergeArraysDefaultURI = DeepMergeArraysDefaultURI.asInstanceOf[js.Any], DeepMergeLeafURI = DeepMergeLeafURI.asInstanceOf[js.Any], DeepMergeMapsDefaultURI = DeepMergeMapsDefaultURI.asInstanceOf[js.Any], DeepMergeRecordsDefaultURI = DeepMergeRecordsDefaultURI.asInstanceOf[js.Any], DeepMergeSetsDefaultURI = DeepMergeSetsDefaultURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepMergeMergeFunctionURItoKind[Ts, MF, M]]
  }
  
  extension [Self <: DeepMergeMergeFunctionURItoKind[?, ?, ?], Ts /* <: js.Array[Any] */, MF /* <: DeepMergeMergeFunctionsURIs */, M](x: Self & (DeepMergeMergeFunctionURItoKind[Ts, MF, M])) {
    
    inline def setDeepMergeArraysDefaultURI(value: DeepMergeArraysDefaultHKT[Ts, MF, M]): Self = StObject.set(x, "DeepMergeArraysDefaultURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeLeafURI(value: DeepMergeLeaf[Ts]): Self = StObject.set(x, "DeepMergeLeafURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeMapsDefaultURI(value: DeepMergeMapsDefaultHKT[Ts]): Self = StObject.set(x, "DeepMergeMapsDefaultURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeRecordsDefaultURI(value: DeepMergeRecordsDefaultHKT[Ts, MF, M]): Self = StObject.set(x, "DeepMergeRecordsDefaultURI", value.asInstanceOf[js.Any])
    
    inline def setDeepMergeSetsDefaultURI(value: DeepMergeSetsDefaultHKT[Ts]): Self = StObject.set(x, "DeepMergeSetsDefaultURI", value.asInstanceOf[js.Any])
  }
}
