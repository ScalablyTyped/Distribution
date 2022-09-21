package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShaderDefineIsDefinedOperator")
@js.native
open class ShaderDefineIsDefinedOperator protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ShaderDefineIsDefinedOperator {
  def this(define: String) = this()
  def this(define: String, not: Boolean) = this()
  
  /* CompleteClass */
  var define: String = js.native
  
  /* CompleteClass */
  override def isTrue(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean = js.native
  
  /* CompleteClass */
  var not: Boolean = js.native
}
