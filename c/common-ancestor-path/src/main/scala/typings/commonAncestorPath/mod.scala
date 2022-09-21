package typings.commonAncestorPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Find the common ancestor of 2 or more paths on Windows or Unix
    *
    * @returns The nearest (deepest) common ancestor path, or `null` if on different roots on Windows.
    *
    * @example
    * import ancestor = require('common-ancestor-path');
    *
    * // output /a/b
    * console.log(ancestor('/a/b/c/d', '/a/b/x/y/z', '/a/b/c/i/j/k'));
    *
    * // normalizes separators, but NOT cases, since it matters sometimes
    * console.log(ancestor('C:\\a\\b\\c', 'C:\\a\\b\\x'));
    *
    * // no common ancestor on different windows drive letters
    * // so, this returns null
    * console.log(ancestor('c:\\a\\b\\c', 'd:\\d\\e\\f'));
    */
  inline def apply(paths: String*): String | Null = ^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String | Null]
  
  @JSImport("common-ancestor-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
