package typings.chayns.chaynsNs

import typings.chayns.JwtPaylod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Utility Functions
  * chayns.utils
  */
@JSGlobal("chayns.utils")
@js.native
object utilsNs extends js.Object {
  /**
    * Utility Functions
    * Miscellaneous
    * chayns.utils
    */
  def getJwtPayload(token: String): JwtPaylod = js.native
  def isArray(parameter: js.Any): Boolean = js.native
  def isBLEAdress(parameter: js.Any): Boolean = js.native
  def isBlank(parameter: js.Any): Boolean = js.native
  def isDate(parameter: js.Any): Boolean = js.native
  def isDeferred(parameter: js.Any): Boolean = js.native
  def isDefined(parameter: js.Any): Boolean = js.native
  def isFormData(parameter: js.Any): Boolean = js.native
  def isFunction(parameter: js.Any): Boolean = js.native
  def isGUID(parameter: js.Any): Boolean = js.native
  /**
    * Utility Functions
    * Check Types
    * chayns.utils
    */
  def isHex(parameter: js.Any, shorthand: Boolean): Boolean = js.native
  def isJwt(parameter: js.Any): Boolean = js.native
  def isMacAdress(parameter: js.Any): Boolean = js.native
  def isNumber(parameter: js.Any): Boolean = js.native
  def isObject(parameter: js.Any): Boolean = js.native
  def isPresent(parameter: js.Any): Boolean = js.native
  def isPromise(parameter: js.Any): Boolean = js.native
  def isString(parameter: js.Any): Boolean = js.native
  def isUUID(parameter: js.Any): Boolean = js.native
  def isUndefined(parameter: js.Any): Boolean = js.native
  def isUrl(parameter: js.Any): Boolean = js.native
  def mixColor(color1: String, color2: String, saturation: Double): String = js.native
  def mod(number: Double, modulo: Double): Double = js.native
  def replacePlaceholder(text: String, parameters: js.Array[_]): String = js.native
  def setLevel(level: Double): Unit = js.native
  def trim(test: String): String = js.native
  @JSName("lang")
  @js.native
  object langNs extends js.Object {
    def get(textString: String): String = js.native
    def init(config: js.Any): Unit = js.native
    def renderTextStrings(): Unit = js.native
    def translateDomStrings(): Unit = js.native
  }
  
  /**
    * Utility Functions
    * Local Storage
    * chayns.utils.ls
    */
  @JSName("ls")
  @js.native
  object lsNs extends js.Object {
    def get(key: String): String = js.native
    def remove(key: String): Unit = js.native
    def removeAll(): Unit = js.native
    def set(key: String, value: String): Unit = js.native
  }
  
}

