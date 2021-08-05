package typings.convertSourceMap

import typings.convertSourceMap.anon.Multiline
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("convert-source-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("convert-source-map", "commentRegex")
  @js.native
  val commentRegex: RegExp = js.native
  
  inline def fromBase64(base64: String): SourceMapConverter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[SourceMapConverter]
  
  inline def fromComment(comment: String): SourceMapConverter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromComment")(comment.asInstanceOf[js.Any]).asInstanceOf[SourceMapConverter]
  
  inline def fromJSON(json: String): SourceMapConverter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SourceMapConverter]
  
  inline def fromMapFileComment(comment: String, commentFileDir: String): SourceMapConverter = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMapFileComment")(comment.asInstanceOf[js.Any], commentFileDir.asInstanceOf[js.Any])).asInstanceOf[SourceMapConverter]
  
  inline def fromMapFileSource(content: String, commentFileDir: String): SourceMapConverter | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMapFileSource")(content.asInstanceOf[js.Any], commentFileDir.asInstanceOf[js.Any])).asInstanceOf[SourceMapConverter | Null]
  
  inline def fromObject(obj: js.Any): SourceMapConverter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[SourceMapConverter]
  
  inline def fromSource(content: String): SourceMapConverter | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSource")(content.asInstanceOf[js.Any]).asInstanceOf[SourceMapConverter | Null]
  
  inline def generateMapFileComment(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMapFileComment")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateMapFileComment(file: String, options: Multiline): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMapFileComment")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("convert-source-map", "mapFileCommentRegex")
  @js.native
  val mapFileCommentRegex: RegExp = js.native
  
  inline def removeComments(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeComments")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeMapFileComments(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeMapFileComments")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait SourceMapConverter extends StObject {
    
    /** Adds given property to the source map. Throws an error if property already exists */
    def addProperty(key: String, value: js.Any): SourceMapConverter = js.native
    
    /** Gets given property of the source map */
    def getProperty(key: String): js.Any = js.native
    
    /** Sets given property to the source map. If property doesn't exist it is added, otherwise its value is updated */
    def setProperty(key: String, value: js.Any): SourceMapConverter = js.native
    
    /** The parsed sourcemap object */
    var sourcemap: js.Any = js.native
    
    /** Converts source map to base64 encoded json string */
    def toBase64(): String = js.native
    
    /**
      * Converts source map to an inline comment that can be appended to the source-file.
      * By default, the comment is formatted like: //# sourceMappingURL=..., which you would normally see in a JS source file.
      * When options.multiline == true, the comment is formatted like: / *# sourceMappingURL=... *\/, which you would find in a CSS source file
      */
    def toComment(): String = js.native
    def toComment(options: Multiline): String = js.native
    
    /** Converts source map to json string. If space is given (optional), this will be passed to JSON.stringify when the JSON string is generated */
    def toJSON(): String = js.native
    def toJSON(space: String): String = js.native
    def toJSON(space: Double): String = js.native
    
    /** Returns a copy of the underlying source map */
    def toObject(): js.Any = js.native
  }
}
