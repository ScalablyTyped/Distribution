package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Typed")
@js.native
abstract class Typed protected ()
  extends /**
  * Other properties on this Resource
  */
/* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Abstract class Typed.
    */
  def this(modelManager: ModelManager, classDeclaration: ClassDeclaration, ns: java.lang.String, `type`: java.lang.String) = this()
  /**
    * Adds a value to an array property on this Resource.
    */
  def addArrayValue(propName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Get the fully-qualified type name of the instance (including namespace).
    */
  def getFullyQualifiedType(): java.lang.String = js.native
  /**
    * Get the namespace of the instance.
    */
  def getNamespace(): java.lang.String = js.native
  /**
    * Get the type of the instance (a short name, not including namespace).
    */
  def getType(): java.lang.String = js.native
  /**
    * Check to see if this instance is an instance of the specified fully qualified
    * type name.
    */
  def instanceOf(fqt: java.lang.String): scala.Boolean = js.native
  /**
    * Sets a property on this Resource.
    */
  def setPropertyValue(propName: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

