package typings.cjson

import org.scalablytyped.runtime.StringDictionary
import typings.cjson.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cjson", "decomment")
  @js.native
  def decomment(str: String): String = js.native
  
  @JSImport("cjson", "extend")
  @js.native
  def extend[T1 /* <: js.Object */, T2 /* <: js.Object */](deep: Boolean, obj1: T1, obj2: T2): T1 with T2 = js.native
  @JSImport("cjson", "extend")
  @js.native
  def extend[T1 /* <: js.Object */, T2 /* <: js.Object */, T3 /* <: js.Object */](obj1: T1, obj2: T2, obj3: T3): T1 with T2 with T3 = js.native
  
  @JSImport("cjson", "freeze")
  @js.native
  def freeze[T](obj: T): T = js.native
  
  @JSImport("cjson", "load")
  @js.native
  def load(path: String): js.Any = js.native
  @JSImport("cjson", "load")
  @js.native
  def load(path: String, options: StringDictionary[String]): js.Any = js.native
  @JSImport("cjson", "load")
  @js.native
  def load(path: String, options: Boolean): js.Any = js.native
  @JSImport("cjson", "load")
  @js.native
  def load(path: js.Array[String]): js.Any = js.native
  @JSImport("cjson", "load")
  @js.native
  def load(path: js.Array[String], options: StringDictionary[String]): js.Any = js.native
  @JSImport("cjson", "load")
  @js.native
  def load(path: js.Array[String], options: Boolean): js.Any = js.native
  
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
    @JSImport("cjson", "options.parse")
    @js.native
    def parse(text: String): js.Any = js.native
    /**
      * you can use any parser you want. the default uses JSON.parse for maximum
      * speed, if it throws it uses uses an alternative parser to give more
      * helpful errors
      */
    @JSImport("cjson", "options.parse")
    @js.native
    def parse(
      text: String,
      reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
    ): js.Any = js.native
    @scala.inline
    def parse_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    /**
      * allows you to do some string replacements, see `cjson.replace`.
      * @default null;
      */
    @JSImport("cjson", "options.replace")
    @js.native
    def replace(json: String, data: StringDictionary[String]): js.Any = js.native
  }
  
  @JSImport("cjson", "parse")
  @js.native
  def parse(text: String): js.Any = js.native
  @JSImport("cjson", "parse")
  @js.native
  def parse(
    text: String,
    reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
  ): js.Any = js.native
  
  @JSImport("cjson", "replace")
  @js.native
  def replace(str: String, data: StringDictionary[js.Any]): String = js.native
}
