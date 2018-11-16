package typings
package chaynsLib.chaynsNs

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
  def getJwtPayload(token: java.lang.String): chaynsLib.JwtPaylod = js.native
  def isArray(parameter: js.Any): scala.Boolean = js.native
  def isBLEAdress(parameter: js.Any): scala.Boolean = js.native
  def isBlank(parameter: js.Any): scala.Boolean = js.native
  def isDate(parameter: js.Any): scala.Boolean = js.native
  def isDeferred(parameter: js.Any): scala.Boolean = js.native
  def isDefined(parameter: js.Any): scala.Boolean = js.native
  def isFormData(parameter: js.Any): scala.Boolean = js.native
  def isFunction(parameter: js.Any): scala.Boolean = js.native
  def isGUID(parameter: js.Any): scala.Boolean = js.native
  /**
           * Utility Functions
           * Check Types
           * chayns.utils
           */
  def isHex(parameter: js.Any, shorthand: scala.Boolean): scala.Boolean = js.native
  def isJwt(parameter: js.Any): scala.Boolean = js.native
  def isMacAdress(parameter: js.Any): scala.Boolean = js.native
  def isNumber(parameter: js.Any): scala.Boolean = js.native
  def isObject(parameter: js.Any): scala.Boolean = js.native
  def isPresent(parameter: js.Any): scala.Boolean = js.native
  def isPromise(parameter: js.Any): scala.Boolean = js.native
  def isString(parameter: js.Any): scala.Boolean = js.native
  def isUUID(parameter: js.Any): scala.Boolean = js.native
  def isUndefined(parameter: js.Any): scala.Boolean = js.native
  def isUrl(parameter: js.Any): scala.Boolean = js.native
  def mixColor(color1: java.lang.String, color2: java.lang.String, saturation: scala.Double): java.lang.String = js.native
  def mod(number: scala.Double, modulo: scala.Double): scala.Double = js.native
  def replacePlaceholder(text: java.lang.String, parameters: js.Array[_]): java.lang.String = js.native
  def setLevel(level: scala.Double): scala.Unit = js.native
  def trim(test: java.lang.String): java.lang.String = js.native
  @JSName("lang")
  @js.native
  object langNs extends js.Object {
    def get(textString: java.lang.String): java.lang.String = js.native
    def init(config: js.Any): scala.Unit = js.native
    def renderTextStrings(): scala.Unit = js.native
    def translateDomStrings(): scala.Unit = js.native
  }
  
  /**
           * Utility Functions
           * Local Storage
           * chayns.utils.ls
           */
  @JSName("ls")
  @js.native
  object lsNs extends js.Object {
    def get(key: java.lang.String): java.lang.String = js.native
    def remove(key: java.lang.String): scala.Unit = js.native
    def removeAll(): scala.Unit = js.native
    def set(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  }
  
}

