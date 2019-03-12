package typings
package consolidateLib.consolidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consolidate extends js.Object {
  // template engines
  @JSName("atpl")
  var atpl_Original: RendererInterface = js.native
  @JSName("dot")
  var dot_Original: RendererInterface = js.native
  @JSName("dust")
  var dust_Original: RendererInterface = js.native
  @JSName("eco")
  var eco_Original: RendererInterface = js.native
  @JSName("ect")
  var ect_Original: RendererInterface = js.native
  @JSName("ejs")
  var ejs_Original: RendererInterface = js.native
  @JSName("haml")
  var haml_Original: RendererInterface = js.native
  // TODO figure out how to do haml-coffee
  @JSName("hamlet")
  var hamlet_Original: RendererInterface = js.native
  @JSName("handlebars")
  var handlebars_Original: RendererInterface = js.native
  @JSName("hogan")
  var hogan_Original: RendererInterface = js.native
  @JSName("htmling")
  var htmling_Original: RendererInterface = js.native
  @JSName("jade")
  var jade_Original: RendererInterface = js.native
  @JSName("jazz")
  var jazz_Original: RendererInterface = js.native
  @JSName("jqtpl")
  var jqtpl_Original: RendererInterface = js.native
  @JSName("just")
  var just_Original: RendererInterface = js.native
  @JSName("liquid")
  var liquid_Original: RendererInterface = js.native
  @JSName("liquor")
  var liquor_Original: RendererInterface = js.native
  @JSName("lodash")
  var lodash_Original: RendererInterface = js.native
  @JSName("mote")
  var mote_Original: RendererInterface = js.native
  @JSName("mustache")
  var mustache_Original: RendererInterface = js.native
  @JSName("nunjucks")
  var nunjucks_Original: RendererInterface = js.native
  @JSName("pug")
  var pug_Original: RendererInterface = js.native
  @JSName("qejs")
  var qejs_Original: RendererInterface = js.native
  @JSName("ractive")
  var ractive_Original: RendererInterface = js.native
  @JSName("react")
  var react_Original: RendererInterface = js.native
  /**
    * expose the instance of the engine
    */
  var requires: js.Object = js.native
  @JSName("swig")
  var swig_Original: RendererInterface = js.native
  @JSName("templayed")
  var templayed_Original: RendererInterface = js.native
  @JSName("toffee")
  var toffee_Original: RendererInterface = js.native
  @JSName("underscore")
  var underscore_Original: RendererInterface = js.native
  @JSName("walrus")
  var walrus_Original: RendererInterface = js.native
  @JSName("whiskers")
  var whiskers_Original: RendererInterface = js.native
  // template engines
  def atpl(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  // template engines
  def atpl(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def atpl(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  // template engines
  def atpl(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  /**
    * Clear the cache.
    *
    * @api public
    */
  def clearCache(): scala.Unit = js.native
  def dot(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def dot(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def dot(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def dot(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def dust(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def dust(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def dust(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def dust(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def eco(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def eco(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def eco(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def eco(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def ect(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def ect(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def ect(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def ect(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def ejs(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def ejs(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def ejs(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def ejs(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def haml(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def haml(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def haml(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def haml(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  // TODO figure out how to do haml-coffee
  def hamlet(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  // TODO figure out how to do haml-coffee
  def hamlet(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def hamlet(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  // TODO figure out how to do haml-coffee
  def hamlet(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def handlebars(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def handlebars(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def handlebars(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def handlebars(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def hogan(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def hogan(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def hogan(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def hogan(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def htmling(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def htmling(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def htmling(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def htmling(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def jade(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def jade(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def jade(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def jade(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def jazz(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def jazz(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def jazz(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def jazz(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def jqtpl(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def jqtpl(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def jqtpl(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def jqtpl(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def just(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def just(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def just(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def just(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def liquid(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def liquid(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def liquid(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def liquid(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def liquor(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def liquor(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def liquor(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def liquor(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def lodash(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def lodash(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def lodash(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def lodash(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def mote(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def mote(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def mote(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def mote(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def mustache(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def mustache(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def mustache(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def mustache(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def nunjucks(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def nunjucks(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def nunjucks(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def nunjucks(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def pug(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def pug(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def pug(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def pug(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def qejs(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def qejs(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def qejs(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def qejs(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def ractive(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def ractive(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def ractive(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def ractive(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def react(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def react(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def react(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def react(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def swig(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def swig(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def swig(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def swig(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def templayed(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def templayed(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def templayed(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def templayed(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def toffee(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def toffee(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def toffee(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def toffee(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def underscore(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def underscore(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def underscore(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def underscore(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def walrus(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def walrus(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def walrus(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def walrus(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
  def whiskers(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def whiskers(path: java.lang.String, fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]): js.Any = js.native
  def whiskers(path: java.lang.String, options: consolidateLib.Anon_Cache): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  def whiskers(
    path: java.lang.String,
    options: consolidateLib.Anon_Cache,
    fn: js.Function2[/* err */ stdLib.Error, /* html */ java.lang.String, _]
  ): js.Any = js.native
}

