package typings.cjson

import org.scalablytyped.runtime.StringDictionary
import typings.cjson.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cjson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decomment(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decomment")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def extend[T1 /* <: js.Object */, T2 /* <: js.Object */](deep: Boolean, obj1: T1, obj2: T2): T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(deep.asInstanceOf[js.Any], obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  @scala.inline
  def extend[T1 /* <: js.Object */, T2 /* <: js.Object */, T3 /* <: js.Object */](obj1: T1, obj2: T2, obj3: T3): T1 & T2 & T3 = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any], obj3.asInstanceOf[js.Any])).asInstanceOf[T1 & T2 & T3]
  
  @scala.inline
  def freeze[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def load(path: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def load(path: String, options: StringDictionary[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def load(path: String, options: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def load(path: js.Array[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def load(path: js.Array[String], options: StringDictionary[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def load(path: js.Array[String], options: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  object options {
    
    @JSImport("cjson", "options")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * you can use any other extension for your config files, f.e. *.cjson
      * @default '.json'
      */
    @JSImport("cjson", "options.ext")
    @js.native
    def ext: String = js.native
    @scala.inline
    def ext_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ext")(x.asInstanceOf[js.Any])
    
    /**
      * freeze config recursively, see `cjson.freeze`
      * @default false
      */
    @JSImport("cjson", "options.freeze")
    @js.native
    def freeze: Boolean = js.native
    @scala.inline
    def freeze_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("freeze")(x.asInstanceOf[js.Any])
    
    /**
      * merge all passed/found config files, see `cjson.extend`
      * @default false;
      */
    @JSImport("cjson", "options.merge")
    @js.native
    def merge: Boolean = js.native
    @scala.inline
    def merge_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("merge")(x.asInstanceOf[js.Any])
    
    /**
      * you can use any parser you want. the default uses JSON.parse for maximum
      * speed, if it throws it uses uses an alternative parser to give more
      * helpful errors
      */
    @JSImport("cjson", "options.parse")
    @js.native
    def parse: FnCall = js.native
    /**
      * you can use any parser you want. the default uses JSON.parse for maximum
      * speed, if it throws it uses uses an alternative parser to give more
      * helpful errors
      */
    @scala.inline
    def parse(text: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    /**
      * you can use any parser you want. the default uses JSON.parse for maximum
      * speed, if it throws it uses uses an alternative parser to give more
      * helpful errors
      */
    @scala.inline
    def parse(
      text: String,
      reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def parse_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    /**
      * allows you to do some string replacements, see `cjson.replace`.
      * @default null;
      */
    @scala.inline
    def replace(json: String, data: StringDictionary[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(json.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @scala.inline
  def parse(text: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def parse(
    text: String,
    reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def replace(str: String, data: StringDictionary[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(str.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
}
