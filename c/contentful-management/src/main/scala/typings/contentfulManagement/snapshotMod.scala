package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.MetaSysPropssnapshotTypes
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotMod {
  
  @JSImport("contentful-management/dist/typings/entities/snapshot", "wrapSnapshot")
  @js.native
  def wrapSnapshot[T](_http: AxiosInstance, data: SnapshotProps[T]): Snapshot[T] = js.native
  
  @JSImport("contentful-management/dist/typings/entities/snapshot", "wrapSnapshotCollection")
  @js.native
  def wrapSnapshotCollection[T](http: AxiosInstance, data: CollectionProp[SnapshotProps[T]]): Collection[Snapshot[T], SnapshotProps[T]] = js.native
  
  @js.native
  trait Snapshot[T]
    extends SnapshotProps[T]
       with DefaultElements[SnapshotProps[T]]
  object Snapshot {
    
    @scala.inline
    def apply[T](snapshot: T, sys: MetaSysPropssnapshotTypes, toPlainObject: () => SnapshotProps[T]): Snapshot[T] = {
      val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
      __obj.asInstanceOf[Snapshot[T]]
    }
  }
  
  @js.native
  trait SnapshotProps[T] extends StObject {
    
    var snapshot: T = js.native
    
    var sys: MetaSysPropssnapshotTypes = js.native
  }
  object SnapshotProps {
    
    @scala.inline
    def apply[T](snapshot: T, sys: MetaSysPropssnapshotTypes): SnapshotProps[T] = {
      val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotProps[T]]
    }
    
    @scala.inline
    implicit class SnapshotPropsMutableBuilder[Self <: SnapshotProps[_], T] (val x: Self with SnapshotProps[T]) extends AnyVal {
      
      @scala.inline
      def setSnapshot(value: T): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysPropssnapshotTypes): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
