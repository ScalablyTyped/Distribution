package typings.bufferJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("buffer-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(text: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def replacer(key: String, value: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replacer")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def reviver(key: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reviver")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def stringify(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
}
