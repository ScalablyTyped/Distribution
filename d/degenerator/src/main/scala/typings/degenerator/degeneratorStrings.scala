package typings.degenerator

import typings.degenerator.mod.DegeneratorOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object degeneratorStrings {
  
  @scala.inline
  def async: async = "async".asInstanceOf[async]
  
  @scala.inline
  def generator: generator = "generator".asInstanceOf[generator]
  
  @js.native
  sealed trait async extends DegeneratorOutput
  
  @js.native
  sealed trait generator extends DegeneratorOutput
}
