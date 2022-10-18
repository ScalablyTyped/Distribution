package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The meta data deepmerge is able to provide.
  */
/* Inlined std.Readonly<{  key :std.PropertyKey,   parents :std.ReadonlyArray<std.Readonly<std.Record<std.PropertyKey, unknown>>>}> */
trait DeepMergeBuiltInMetaData extends StObject {
  
  val key: PropertyKey
  
  val parents: js.Array[Record[PropertyKey, Any]]
}
object DeepMergeBuiltInMetaData {
  
  inline def apply(key: PropertyKey, parents: js.Array[Record[PropertyKey, Any]]): DeepMergeBuiltInMetaData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepMergeBuiltInMetaData]
  }
  
  extension [Self <: DeepMergeBuiltInMetaData](x: Self) {
    
    inline def setKey(value: PropertyKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Array[Record[PropertyKey, Any]]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: (Record[PropertyKey, Any])*): Self = StObject.set(x, "parents", js.Array(value*))
  }
}
