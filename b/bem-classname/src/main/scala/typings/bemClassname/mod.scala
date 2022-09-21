package typings.bemClassname

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(block: Block): String = ^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(block: Block, elementOrModifiers: Unit, modifier: Modifier): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], elementOrModifiers.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(block: Block, elementOrModifiers: Unit, modifier: Modifiers): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], elementOrModifiers.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(block: Block, elementOrModifiers: Element): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], elementOrModifiers.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(block: Block, elementOrModifiers: Element, modifier: Modifier): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], elementOrModifiers.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(block: Block, elementOrModifiers: Element, modifier: Modifiers): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], elementOrModifiers.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(block: Block, elementOrModifiers: Modifiers): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], elementOrModifiers.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(block: Block, elementOrModifiers: Modifiers, modifier: Modifier): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], elementOrModifiers.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(block: Block, elementOrModifiers: Modifiers, modifier: Modifiers): String = (^.asInstanceOf[js.Dynamic].apply(block.asInstanceOf[js.Any], elementOrModifiers.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("bem-classname", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Block = String
  
  type Element = String
  
  type Modifier = String
  
  type Modifiers = js.Array[Any] | (Record[String, Any])
}
