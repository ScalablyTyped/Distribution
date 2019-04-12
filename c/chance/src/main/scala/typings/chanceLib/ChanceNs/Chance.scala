package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chance extends Seeded {
  @JSName("set")
  var set_Original: Setter = js.native
  // Location
  def address(): java.lang.String = js.native
  def address(opts: Options): java.lang.String = js.native
  // Person
  def age(): scala.Double = js.native
  def age(opts: Options): scala.Double = js.native
  def altitude(): scala.Double = js.native
  def altitude(opts: Options): scala.Double = js.native
  // Time
  def ampm(): java.lang.String = js.native
  // Mobile
  def android_id(): java.lang.String = js.native
  // Mobile
  def animal(): java.lang.String = js.native
  def animal(opts: Options): java.lang.String = js.native
  def apple_token(): java.lang.String = js.native
  def areacode(): java.lang.String = js.native
  // Web
  def avatar(): java.lang.String = js.native
  def avatar(opts: Options): java.lang.String = js.native
  def bb_pin(): java.lang.String = js.native
  def birthday(): stdLib.Date | java.lang.String = js.native
  def birthday(opts: Options): stdLib.Date | java.lang.String = js.native
  @JSName("birthday")
  def birthday_Date(): stdLib.Date = js.native
  // Basics
  def bool(): scala.Boolean = js.native
  def bool(opts: Options): scala.Boolean = js.native
  // Helpers
  def capitalize(str: java.lang.String): java.lang.String = js.native
  // Finance
  def cc(): java.lang.String = js.native
  def cc(opts: Options): java.lang.String = js.native
  def cc_type(): java.lang.String = js.native
  def cc_type(opts: Options): java.lang.String | CreditCardType = js.native
  // "Hidden"
  def cc_types(): js.Array[CreditCardType] = js.native
  def cf(): java.lang.String = js.native
  def cf(opts: Options): java.lang.String = js.native
  def character(): java.lang.String = js.native
  def character(opts: Options): java.lang.String = js.native
  def city(): java.lang.String = js.native
  // Miscellaneous
  def coin(): java.lang.String = js.native
  def color(): java.lang.String = js.native
  def color(opts: Options): java.lang.String = js.native
  def company(): java.lang.String = js.native
  def coordinates(): java.lang.String = js.native
  def coordinates(opts: Options): java.lang.String = js.native
  def country(): java.lang.String = js.native
  def country(opts: Options): java.lang.String = js.native
  def cpf(): java.lang.String = js.native
  def currency(): Currency = js.native
  def currency_pair(): js.Tuple2[Currency, Currency] = js.native
  def d10(): scala.Double = js.native
  def d100(): scala.Double = js.native
  def d12(): scala.Double = js.native
  def d20(): scala.Double = js.native
  def d30(): scala.Double = js.native
  def d4(): scala.Double = js.native
  def d6(): scala.Double = js.native
  def d8(): scala.Double = js.native
  def date(): stdLib.Date = js.native
  def date(opts: DateOptions): stdLib.Date | java.lang.String = js.native
  def depth(): scala.Double = js.native
  def depth(opts: Options): scala.Double = js.native
  def dollar(): java.lang.String = js.native
  def dollar(opts: Options): java.lang.String = js.native
  def domain(): java.lang.String = js.native
  def domain(opts: Options): java.lang.String = js.native
  def email(): java.lang.String = js.native
  def email(opts: Options): java.lang.String = js.native
  def euro(): java.lang.String = js.native
  def euro(opts: Options): java.lang.String = js.native
  def exp(): java.lang.String = js.native
  def exp(opts: Options): java.lang.String | CreditCardExpiration = js.native
  def exp_month(): java.lang.String = js.native
  def exp_month(opts: Options): java.lang.String = js.native
  def exp_year(): java.lang.String = js.native
  def exp_year(opts: Options): java.lang.String = js.native
  def fbid(): java.lang.String = js.native
  def first(): java.lang.String = js.native
  def first(opts: Options): java.lang.String = js.native
  def floating(): scala.Double = js.native
  def floating(opts: Options): scala.Double = js.native
  def gender(): java.lang.String = js.native
  def geohash(): java.lang.String = js.native
  def geohash(opts: Options): java.lang.String = js.native
  def google_analytics(): java.lang.String = js.native
  def guid(): java.lang.String = js.native
  def guid(options: chanceLib.Anon_4): java.lang.String = js.native
  def hammertime(): scala.Double = js.native
  def hash(): java.lang.String = js.native
  def hash(opts: Options): java.lang.String = js.native
  def hashtag(): java.lang.String = js.native
  def hour(): scala.Double = js.native
  def hour(opts: Options): scala.Double = js.native
  def integer(): scala.Double = js.native
  def integer(opts: Options): scala.Double = js.native
  def ip(): java.lang.String = js.native
  def ipv6(): java.lang.String = js.native
  def klout(): java.lang.String = js.native
  def last(): java.lang.String = js.native
  def last(opts: Options): java.lang.String = js.native
  def latitude(): scala.Double = js.native
  def latitude(opts: Options): scala.Double = js.native
  def letter(): java.lang.String = js.native
  def letter(opts: Options): java.lang.String = js.native
  def locale(): java.lang.String = js.native
  def locale(opts: LocaleOptions): java.lang.String = js.native
  def locales(): java.lang.String = js.native
  def locales(opts: LocaleOptions): java.lang.String = js.native
  def longitude(): scala.Double = js.native
  def longitude(opts: Options): scala.Double = js.native
  def mersenne_twister(): js.Any = js.native
  def mersenne_twister(seed: Seed): js.Any = js.native
  def millisecond(): scala.Double = js.native
  def minute(): scala.Double = js.native
  def mixin(desc: MixinDescriptor): js.Any = js.native
  def month(): java.lang.String = js.native
  def month(opts: Options): Month = js.native
   // API return type not defined in docs
  def months(): js.Array[Month] = js.native
  def n[T](generator: js.Function0[T], count: scala.Double): js.Array[T] = js.native
  def n[T](generator: js.Function0[T], count: scala.Double, opts: Options): js.Array[T] = js.native
  def name(): java.lang.String = js.native
  def name(opts: Options): java.lang.String = js.native
  def name_prefix(): java.lang.String = js.native
  def name_prefix(opts: Options): java.lang.String = js.native
  def name_prefixes(): js.Array[Name] = js.native
  def name_suffix(): java.lang.String = js.native
  def name_suffix(opts: Options): java.lang.String = js.native
  def natural(): scala.Double = js.native
  def natural(opts: Options): scala.Double = js.native
  def normal(): scala.Double = js.native
  def normal(opts: Options): scala.Double = js.native
  def pad(num: scala.Double, width: scala.Double): java.lang.String = js.native
  def pad(num: scala.Double, width: scala.Double, padChar: java.lang.String): java.lang.String = js.native
  // Text
  def paragraph(): java.lang.String = js.native
  def paragraph(opts: Options): java.lang.String = js.native
  def phone(): java.lang.String = js.native
  def phone(opts: Options): java.lang.String = js.native
  /**
    * @deprecated Use pickone
    */
  def pick[T](arr: js.Array[T]): T = js.native
  /**
    * @deprecated Use pickset
    */
  def pick[T](arr: js.Array[T], count: scala.Double): js.Array[T] = js.native
  def pickone[T](arr: js.Array[T]): T = js.native
  def pickset[T](arr: js.Array[T]): js.Array[T] = js.native
  def pickset[T](arr: js.Array[T], count: scala.Double): js.Array[T] = js.native
  def postal(): java.lang.String = js.native
  def prefix(): java.lang.String = js.native
  def prefix(opts: Options): java.lang.String = js.native
  def profession(): java.lang.String = js.native
  def profession(opts: Options): java.lang.String = js.native
  def province(): java.lang.String = js.native
  def province(opts: Options): java.lang.String = js.native
  def provinces(): js.Array[Name] = js.native
  def radio(): java.lang.String = js.native
  def radio(opts: Options): java.lang.String = js.native
  def rpg(dice: java.lang.String): js.Array[scala.Double] = js.native
  def rpg(dice: java.lang.String, opts: Options): js.Array[scala.Double] | scala.Double = js.native
  @JSName("rpg")
  def `rpg_<union>`(dice: java.lang.String): js.Array[scala.Double] | scala.Double = js.native
  def second(): scala.Double = js.native
  def sentence(): java.lang.String = js.native
  def sentence(opts: Options): java.lang.String = js.native
  def set[T](key: java.lang.String, values: js.Array[T]): js.Any = js.native
  @JSName("set")
  def set_armed_forces(key: chanceLib.chanceLibStrings.armed_forces, values: js.Array[java.lang.String]): js.Any = js.native
  @JSName("set")
  def set_cc_types(key: chanceLib.chanceLibStrings.cc_types, values: js.Array[java.lang.String]): js.Any = js.native
  @JSName("set")
  def set_currency_types(key: chanceLib.chanceLibStrings.currency_types, values: js.Array[java.lang.String]): js.Any = js.native
  @JSName("set")
  def set_firstNames(key: chanceLib.chanceLibStrings.firstNames, values: js.Array[java.lang.String]): js.Any = js.native
  @JSName("set")
  def set_lastNames(key: chanceLib.chanceLibStrings.lastNames, values: js.Array[java.lang.String]): js.Any = js.native
  @JSName("set")
  def set_months(key: chanceLib.chanceLibStrings.months, values: js.Array[java.lang.String]): js.Any = js.native
  @JSName("set")
  def set_provinces(key: chanceLib.chanceLibStrings.provinces, values: js.Array[java.lang.String]): js.Any = js.native
  @JSName("set")
  def set_street_suffixes(key: chanceLib.chanceLibStrings.street_suffixes, values: js.Array[java.lang.String]): js.Any = js.native
  @JSName("set")
  def set_territories(key: chanceLib.chanceLibStrings.territories, values: js.Array[java.lang.String]): js.Any = js.native
  @JSName("set")
  def set_us_states_and_dc(key: chanceLib.chanceLibStrings.us_states_and_dc, values: js.Array[java.lang.String]): js.Any = js.native
  def shuffle[T](arr: js.Array[T]): js.Array[T] = js.native
  def ssn(): java.lang.String = js.native
  def ssn(opts: Options): java.lang.String = js.native
  def state(): java.lang.String = js.native
  def state(opts: Options): java.lang.String = js.native
  def states(): js.Array[Name] = js.native
  def street(): java.lang.String = js.native
  def street(opts: Options): java.lang.String = js.native
  def street_suffix(): Name = js.native
  def street_suffixes(): js.Array[Name] = js.native
  def string(): java.lang.String = js.native
  def string(opts: Options): java.lang.String = js.native
  def suffix(): java.lang.String = js.native
  def suffix(opts: Options): java.lang.String = js.native
  def syllable(): java.lang.String = js.native
  def syllable(opts: Options): java.lang.String = js.native
  def timestamp(): scala.Double = js.native
  def timezone(): Timezone = js.native
  def tld(): java.lang.String = js.native
  def tv(): java.lang.String = js.native
  def tv(opts: Options): java.lang.String = js.native
  def twitter(): java.lang.String = js.native
  def unique[T](generator: js.Function0[T], count: scala.Double): js.Array[T] = js.native
  def unique[T](generator: js.Function0[T], count: scala.Double, opts: Options): js.Array[T] = js.native
  def url(): java.lang.String = js.native
  def url(opts: Options): java.lang.String = js.native
  def weekday(opts: Options): chanceLib.chanceLibStrings.Monday | chanceLib.chanceLibStrings.Tuesday | chanceLib.chanceLibStrings.Wednesday | chanceLib.chanceLibStrings.Thursday | chanceLib.chanceLibStrings.Friday | chanceLib.chanceLibStrings.Saturday | chanceLib.chanceLibStrings.Sunday = js.native
  def weighted[T](values: js.Array[T], weights: js.Array[scala.Double]): T = js.native
  def word(): java.lang.String = js.native
  def word(opts: Options): java.lang.String = js.native
  def wp7_anid(): java.lang.String = js.native
  def wp8_anid2(): java.lang.String = js.native
  def year(): java.lang.String = js.native
  def year(opts: Options): java.lang.String = js.native
  def zip(): java.lang.String = js.native
  def zip(opts: Options): java.lang.String = js.native
}

