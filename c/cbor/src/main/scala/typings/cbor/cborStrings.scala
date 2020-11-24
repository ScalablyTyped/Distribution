package typings.cbor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cborStrings {
  
  @scala.inline
  def cbor: cbor = "cbor".asInstanceOf[cbor]
  
  @scala.inline
  def float: float = "float".asInstanceOf[float]
  
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait cbor extends js.Object
  
  @js.native
  sealed trait float extends js.Object
  
  @js.native
  sealed trait int extends js.Object
  
  @js.native
  sealed trait number extends js.Object
  
  @js.native
  sealed trait string extends js.Object
}
