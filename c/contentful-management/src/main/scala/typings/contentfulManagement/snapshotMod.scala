package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.MetaSysPropssnapshotTypes
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotMod {
  
  @JSImport("contentful-management/dist/typings/entities/snapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapSnapshot[T](_http: AxiosInstance, data: SnapshotProps[T]): Snapshot[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapSnapshot")(_http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Snapshot[T]]
  
  inline def wrapSnapshotCollection[T](http: AxiosInstance, data: CollectionProp[SnapshotProps[T]]): Collection[Snapshot[T], SnapshotProps[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapSnapshotCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Snapshot[T], SnapshotProps[T]]]
  
  trait Snapshot[T]
    extends StObject
       with SnapshotProps[T]
       with DefaultElements[SnapshotProps[T]]
  object Snapshot {
    
    inline def apply[T](snapshot: T, sys: MetaSysPropssnapshotTypes, toPlainObject: () => SnapshotProps[T]): Snapshot[T] = {
      val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
      __obj.asInstanceOf[Snapshot[T]]
    }
  }
  
  trait SnapshotProps[T] extends StObject {
    
    var snapshot: T
    
    var sys: MetaSysPropssnapshotTypes
  }
  object SnapshotProps {
    
    inline def apply[T](snapshot: T, sys: MetaSysPropssnapshotTypes): SnapshotProps[T] = {
      val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotProps[T]]
    }
    
    extension [Self <: SnapshotProps[?], T](x: Self & SnapshotProps[T]) {
      
      inline def setSnapshot(value: T): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      inline def setSys(value: MetaSysPropssnapshotTypes): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
