package typings.contractProxyKit

import typings.ethers.wordlistMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwordlists extends js.Object {
  val en: Wordlist
  val it: Wordlist
  val ja: Wordlist
  val ko: Wordlist
  val zh: Wordlist
  val zh_cn: Wordlist
  val zh_tw: Wordlist
}

object Typeofwordlists {
  @scala.inline
  def apply(
    en: Wordlist,
    it: Wordlist,
    ja: Wordlist,
    ko: Wordlist,
    zh: Wordlist,
    zh_cn: Wordlist,
    zh_tw: Wordlist
  ): Typeofwordlists = {
    val __obj = js.Dynamic.literal(en = en.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], ja = ja.asInstanceOf[js.Any], ko = ko.asInstanceOf[js.Any], zh = zh.asInstanceOf[js.Any], zh_cn = zh_cn.asInstanceOf[js.Any], zh_tw = zh_tw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwordlists]
  }
}

