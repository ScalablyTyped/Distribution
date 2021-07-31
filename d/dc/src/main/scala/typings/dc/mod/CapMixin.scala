package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapMixin[T] extends StObject {
  
  def cap(): Double
  def cap(t: Double): T
  @JSName("cap")
  var cap_Original: IGetSet[Double, T]
  
  def othersGrouper(): js.Function1[/* data */ js.Array[js.Any], js.Array[js.Any]]
  def othersGrouper(t: js.Function1[/* data */ js.Array[js.Any], js.Array[js.Any]]): T
  @JSName("othersGrouper")
  var othersGrouper_Original: IGetSet[js.Function1[/* data */ js.Array[js.Any], js.Array[js.Any]], T]
  
  def othersLabel(): String
  def othersLabel(t: String): T
  @JSName("othersLabel")
  var othersLabel_Original: IGetSet[String, T]
}
object CapMixin {
  
  @scala.inline
  def apply[T](
    cap: IGetSet[Double, T],
    othersGrouper: IGetSet[js.Function1[/* data */ js.Array[js.Any], js.Array[js.Any]], T],
    othersLabel: IGetSet[String, T]
  ): CapMixin[T] = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], othersGrouper = othersGrouper.asInstanceOf[js.Any], othersLabel = othersLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapMixin[T]]
  }
  
  @scala.inline
  implicit class CapMixinMutableBuilder[Self <: CapMixin[?], T] (val x: Self & CapMixin[T]) extends AnyVal {
    
    @scala.inline
    def setCap(value: IGetSet[Double, T]): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOthersGrouper(value: IGetSet[js.Function1[/* data */ js.Array[js.Any], js.Array[js.Any]], T]): Self = StObject.set(x, "othersGrouper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOthersLabel(value: IGetSet[String, T]): Self = StObject.set(x, "othersLabel", value.asInstanceOf[js.Any])
  }
}
