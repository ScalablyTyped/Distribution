package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toKeyAlias {
  
  inline def apply(node: Method): String = ^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(node: Method, key: Node): String = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(node: Property): String = ^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(node: Property, key: Node): String = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@babel/types/lib", "toKeyAlias")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@babel/types/lib", "toKeyAlias.increment")
  @js.native
  def increment: js.Function0[Double] = js.native
  inline def increment_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("increment")(x.asInstanceOf[js.Any])
  
  @JSImport("@babel/types/lib", "toKeyAlias.uid")
  @js.native
  def uid: Double = js.native
  inline def uid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
}
