package typings.awsSdkIsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/is-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isNode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")().asInstanceOf[Boolean]
}
