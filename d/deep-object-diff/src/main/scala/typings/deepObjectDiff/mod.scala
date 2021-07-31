package typings.deepObjectDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deep-object-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addedDiff(originalObj: js.Object, updatedObj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addedDiff")(originalObj.asInstanceOf[js.Any], updatedObj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def deletedDiff(originalObj: js.Object, updatedObj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("deletedDiff")(originalObj.asInstanceOf[js.Any], updatedObj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def detailedDiff(originalObj: js.Object, updatedObj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("detailedDiff")(originalObj.asInstanceOf[js.Any], updatedObj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def diff(originalObj: js.Object, updatedObj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(originalObj.asInstanceOf[js.Any], updatedObj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def updatedDiff(originalObj: js.Object, updatedObj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("updatedDiff")(originalObj.asInstanceOf[js.Any], updatedObj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
