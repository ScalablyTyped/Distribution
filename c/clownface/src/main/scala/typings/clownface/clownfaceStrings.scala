package typings.clownface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object clownfaceStrings {
  @js.native
  sealed trait BlankNode extends js.Object
  
  @js.native
  sealed trait Literal extends js.Object
  
  @js.native
  sealed trait NamedNode extends js.Object
  
  @scala.inline
  def BlankNode: BlankNode = "BlankNode".asInstanceOf[BlankNode]
  @scala.inline
  def Literal: Literal = "Literal".asInstanceOf[Literal]
  @scala.inline
  def NamedNode: NamedNode = "NamedNode".asInstanceOf[NamedNode]
}

