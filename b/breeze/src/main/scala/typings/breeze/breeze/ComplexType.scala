package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplexType
  extends StObject
     with IStructuralType {
  
  def addProperty(dataProperty: DataProperty): ComplexType = js.native
  
  def createInstance(): ComplexObject = js.native
  def createInstance(initialValues: js.Object): ComplexObject = js.native
  
  def getProperties(): js.Array[DataProperty] = js.native
}
