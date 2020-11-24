package typings.cjson

import org.scalablytyped.runtime.StringDictionary
import typings.cjson.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cjson", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decomment(str: String): String = js.native
  
  def extend[T1 /* <: js.Object */, T2 /* <: js.Object */](deep: Boolean, obj1: T1, obj2: T2): T1 with T2 = js.native
  def extend[T1 /* <: js.Object */, T2 /* <: js.Object */, T3 /* <: js.Object */](obj1: T1, obj2: T2, obj3: T3): T1 with T2 with T3 = js.native
  
  def freeze[T](obj: T): T = js.native
  
  def load(path: String): js.Any = js.native
  def load(path: String, options: StringDictionary[String]): js.Any = js.native
  def load(path: String, options: Boolean): js.Any = js.native
  def load(path: js.Array[String]): js.Any = js.native
  def load(path: js.Array[String], options: StringDictionary[String]): js.Any = js.native
  def load(path: js.Array[String], options: Boolean): js.Any = js.native
  
  def replace(str: String, data: StringDictionary[js.Any]): String = js.native
  
  @js.native
  object options extends js.Object {
    
    /**
      * you can use any other extension for your config files, f.e. *.cjson
      * @default '.json'
      */
    var ext: String = js.native
    
    /**
      * freeze config recursively, see `cjson.freeze`
      * @default false
      */
    var freeze: Boolean = js.native
    
    /**
      * merge all passed/found config files, see `cjson.extend`
      * @default false;
      */
    var merge: Boolean = js.native
    
    /**
      * you can use any parser you want. the default uses JSON.parse for maximum
      * speed, if it throws it uses uses an alternative parser to give more
      * helpful errors
      */
    def parse(text: String): js.Any = js.native
    /**
      * you can use any parser you want. the default uses JSON.parse for maximum
      * speed, if it throws it uses uses an alternative parser to give more
      * helpful errors
      */
    def parse(
      text: String,
      reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
    ): js.Any = js.native
    /**
      * you can use any parser you want. the default uses JSON.parse for maximum
      * speed, if it throws it uses uses an alternative parser to give more
      * helpful errors
      */
    @JSName("parse")
    var parse_Original: FnCall = js.native
    
    /**
      * allows you to do some string replacements, see `cjson.replace`.
      * @default null;
      */
    def replace(json: String, data: StringDictionary[String]): js.Any = js.native
  }
  
  @js.native
  object parse extends js.Object {
    
    def apply(text: String): js.Any = js.native
    def apply(
      text: String,
      reviver: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
    ): js.Any = js.native
  }
}
