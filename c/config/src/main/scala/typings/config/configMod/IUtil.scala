package typings.config.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://github.com/lorenwest/node-config/wiki/Using-Config-Utilities
@js.native
trait IUtil extends js.Object {
  // Return a deep copy of the specified object.
  def cloneDeep(copyFrom: js.Any): js.Any = js.native
  def cloneDeep(copyFrom: js.Any, depth: Double): js.Any = js.native
  // Returns an object containing all elements that differ between two objects.
  def diffDeep(object1: js.Any, object2: js.Any): js.Any = js.native
  def diffDeep(object1: js.Any, object2: js.Any, depth: Double): js.Any = js.native
  // Return true if two objects have equal contents.
  def equalsDeep(object1: js.Any, object2: js.Any): Boolean = js.native
  def equalsDeep(object1: js.Any, object2: js.Any, dept: Double): Boolean = js.native
  // Extend an object (and any object it contains) with one or more objects (and objects contained in them).
  def extendDeep(mergeInto: js.Any, mergeFrom: js.Any): js.Any = js.native
  def extendDeep(mergeInto: js.Any, mergeFrom: js.Any, depth: Double): js.Any = js.native
  // Return the sources for the configurations
  def getConfigSources(): js.Array[IConfigSource] = js.native
  // Get the current value of a config environment variable
  def getEnv(varName: String): String = js.native
  // Return the config for the project based on directory param if not directory then return default one (config).
  def loadFileConfigs(configDir: String): js.Any = js.native
  // Make an object property hidden so it doesn't appear when enumerating elements of the object.
  def makeHidden(`object`: js.Any, propertyName: String): js.Any = js.native
  def makeHidden(`object`: js.Any, propertyName: String, propertyValue: String): js.Any = js.native
  // Make a javascript object property immutable (assuring it cannot be changed from the current value).
  def makeImmutable(`object`: js.Any): js.Any = js.native
  def makeImmutable(`object`: js.Any, propertyName: String): js.Any = js.native
  def makeImmutable(`object`: js.Any, propertyName: String, propertyValue: String): js.Any = js.native
  /**
    * This allows module developers to attach their configurations onto
    * the 6 years agoInitial 0.4 checkin default configuration object so
    * they can be configured by the consumers of the module.
    */
  def setModuleDefaults(moduleName: String, defaults: js.Any): js.Any = js.native
  // Returns a new deep copy of the current config object, or any part of the config if provided.
  def toObject(): js.Any = js.native
  def toObject(config: js.Any): js.Any = js.native
}

