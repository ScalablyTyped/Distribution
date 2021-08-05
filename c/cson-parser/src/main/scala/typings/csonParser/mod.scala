package typings.csonParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cson-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(text: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def parse(text: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def stringify(data: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(data: js.Any, visitor: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(data: js.Any, visitor: js.Function2[/* key */ String, /* value */ js.Any, js.Any], indent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(data: js.Any, visitor: js.Function2[/* key */ String, /* value */ js.Any, js.Any], indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(data: js.Any, visitor: Null, indent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(data: js.Any, visitor: Null, indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(data: js.Any, visitor: Unit, indent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(data: js.Any, visitor: Unit, indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
}
