package typings.composerDashConcerto.composerDashConcertoMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Typed")
@js.native
abstract class Typed protected ()
  extends /**
  * Other properties on this Resource
  */
/* propertyName */ StringDictionary[js.Any] {
  /**
    * Abstract class Typed.
    */
  def this(modelManager: ModelManager, classDeclaration: ClassDeclaration, ns: String, `type`: String) = this()
  /**
    * Adds a value to an array property on this Resource.
    */
  def addArrayValue(propName: String, value: String): Unit = js.native
  /**
    * Get the fully-qualified type name of the instance (including namespace).
    */
  def getFullyQualifiedType(): String = js.native
  /**
    * Get the namespace of the instance.
    */
  def getNamespace(): String = js.native
  /**
    * Get the type of the instance (a short name, not including namespace).
    */
  def getType(): String = js.native
  /**
    * Check to see if this instance is an instance of the specified fully qualified
    * type name.
    */
  def instanceOf(fqt: String): Boolean = js.native
  /**
    * Sets a property on this Resource.
    */
  def setPropertyValue(propName: String, value: String): Unit = js.native
}

