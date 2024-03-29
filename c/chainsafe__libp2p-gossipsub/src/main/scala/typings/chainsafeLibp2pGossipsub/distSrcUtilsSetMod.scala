package typings.chainsafeLibp2pGossipsub

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsSetMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/utils/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/utils/set", "MapDef")
  @js.native
  open class MapDef[K, V] protected ()
    extends StObject
       with Map[K, V] {
    def this(getDefault: js.Function0[V]) = this()
    
    /* private */ val getDefault: Any = js.native
    
    def getOrDefault(key: K): V = js.native
  }
  
  inline def removeFirstNItemsFromSet[T](superSet: Set[T], ineed: Double): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFirstNItemsFromSet")(superSet.asInstanceOf[js.Any], ineed.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
  
  inline def removeItemsFromSet[T](superSet: Set[T], ineed: Double): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItemsFromSet")(superSet.asInstanceOf[js.Any], ineed.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
  inline def removeItemsFromSet[T](superSet: Set[T], ineed: Double, cond: js.Function1[/* peer */ T, Boolean]): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItemsFromSet")(superSet.asInstanceOf[js.Any], ineed.asInstanceOf[js.Any], cond.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
}
