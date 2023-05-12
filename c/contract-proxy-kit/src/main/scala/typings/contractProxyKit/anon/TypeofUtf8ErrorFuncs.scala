package typings.contractProxyKit.anon

import typings.ethers.typesUtilsUtf8Mod.Utf8ErrorReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUtf8ErrorFuncs extends StObject {
  
  def error(reason: Utf8ErrorReason, offset: Double, bytes: js.typedarray.Uint8Array, output: js.Array[Double]): Double = js.native
  def error(
    reason: Utf8ErrorReason,
    offset: Double,
    bytes: js.typedarray.Uint8Array,
    output: js.Array[Double],
    badCodepoint: Double
  ): Double = js.native
  
  def ignore(reason: Utf8ErrorReason, offset: Double, bytes: js.typedarray.Uint8Array, output: js.Array[Double]): Double = js.native
  def ignore(
    reason: Utf8ErrorReason,
    offset: Double,
    bytes: js.typedarray.Uint8Array,
    output: js.Array[Double],
    badCodepoint: Double
  ): Double = js.native
  
  def replace(reason: Utf8ErrorReason, offset: Double, bytes: js.typedarray.Uint8Array, output: js.Array[Double]): Double = js.native
  def replace(
    reason: Utf8ErrorReason,
    offset: Double,
    bytes: js.typedarray.Uint8Array,
    output: js.Array[Double],
    badCodepoint: Double
  ): Double = js.native
}
