package typings.cwiseDashCompiler

import typings.cwiseDashCompiler.cwiseDashCompilerMod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cwiseDashCompilerStrings {
  @js.native
  sealed trait array extends ArgType
  
  @js.native
  sealed trait index extends ArgType
  
  @js.native
  sealed trait offset extends ArgType
  
  @js.native
  sealed trait scalar extends ArgType
  
  @js.native
  sealed trait shape extends ArgType
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def index: index = "index".asInstanceOf[index]
  @scala.inline
  def offset: offset = "offset".asInstanceOf[offset]
  @scala.inline
  def scalar: scalar = "scalar".asInstanceOf[scalar]
  @scala.inline
  def shape: shape = "shape".asInstanceOf[shape]
}

