package typings.chance.Chance

import typings.chance.Anon_4
import typings.chance.Anon_Likelihood
import typings.chance.Anon_Region
import typings.chance.AtLeastOneKey
import typings.chance.chanceStrings.Friday
import typings.chance.chanceStrings.Monday
import typings.chance.chanceStrings.Saturday
import typings.chance.chanceStrings.Sunday
import typings.chance.chanceStrings.Thursday
import typings.chance.chanceStrings.Tuesday
import typings.chance.chanceStrings.Wednesday
import typings.chance.chanceStrings.armed_forces
import typings.chance.chanceStrings.cc_types
import typings.chance.chanceStrings.currency_types
import typings.chance.chanceStrings.firstNames
import typings.chance.chanceStrings.lastNames
import typings.chance.chanceStrings.months
import typings.chance.chanceStrings.provinces
import typings.chance.chanceStrings.street_suffixes
import typings.chance.chanceStrings.territories
import typings.chance.chanceStrings.us_states_and_dc
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chance extends Seeded {
  @JSName("set")
  var set_Original: Setter = js.native
  // Location
  def address(): String = js.native
  def address(opts: Options): String = js.native
  // Person
  def age(): Double = js.native
  def age(opts: Options): Double = js.native
  def altitude(): Double = js.native
  def altitude(opts: Options): Double = js.native
  // Time
  def ampm(): String = js.native
  // Mobile
  def android_id(): String = js.native
  // Mobile
  def animal(): String = js.native
  def animal(opts: Options): String = js.native
  def apple_token(): String = js.native
  def areacode(): String = js.native
  // Web
  def avatar(): String = js.native
  def avatar(opts: Options): String = js.native
  def bb_pin(): String = js.native
  def birthday(): Date | String = js.native
  def birthday(opts: Options): Date | String = js.native
  @JSName("birthday")
  def birthday_Date(): Date = js.native
  // Basics
  def bool(): Boolean = js.native
  def bool(opts: Anon_Likelihood): Boolean = js.native
  // Helpers
  def capitalize(str: String): String = js.native
  // Finance
  def cc(): String = js.native
  def cc(opts: Options): String = js.native
  def cc_type(): String = js.native
  def cc_type(opts: Options): String | CreditCardType = js.native
  // "Hidden"
  def cc_types(): js.Array[CreditCardType] = js.native
  def cf(): String = js.native
  def cf(opts: Options): String = js.native
  def character(): String = js.native
  def character(
    opts: AtLeastOneKey[
      CharacterOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in 'casing' | 'pool' | 'alpha' | 'numeric' | 'symbols' ]: std.Pick<chance.Chance.CharacterOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): String = js.native
  def city(): String = js.native
  // Miscellaneous
  def coin(): String = js.native
  def color(): String = js.native
  def color(opts: Options): String = js.native
  def company(): String = js.native
  def coordinates(): String = js.native
  def coordinates(opts: Options): String = js.native
  def country(): String = js.native
  def country(opts: Options): String = js.native
  def cpf(): String = js.native
  def currency(): Currency = js.native
  def currency_pair(): js.Tuple2[Currency, Currency] = js.native
  def d10(): Double = js.native
  def d100(): Double = js.native
  def d12(): Double = js.native
  def d20(): Double = js.native
  def d30(): Double = js.native
  def d4(): Double = js.native
  def d6(): Double = js.native
  def d8(): Double = js.native
  def date(): Date = js.native
  def date(opts: DateOptions): Date | String = js.native
  def depth(): Double = js.native
  def depth(opts: Options): Double = js.native
  def dollar(): String = js.native
  def dollar(opts: Options): String = js.native
  def domain(): String = js.native
  def domain(opts: Options): String = js.native
  def email(): String = js.native
  def email(
    opts: AtLeastOneKey[
      EmailOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in 'length' | 'domain' ]: std.Pick<chance.Chance.EmailOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): String = js.native
  def euro(): String = js.native
  def euro(opts: Options): String = js.native
  def exp(): String = js.native
  def exp(opts: Options): String | CreditCardExpiration = js.native
  def exp_month(): String = js.native
  def exp_month(opts: Options): String = js.native
  def exp_year(): String = js.native
  def exp_year(opts: Options): String = js.native
  def fbid(): String = js.native
  def first(): String = js.native
  def first(
    opts: AtLeastOneKey[
      FirstNameOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in 'gender' | 'nationality' ]: std.Pick<chance.Chance.FirstNameOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): String = js.native
  def floating(): Double = js.native
  def floating(opts: Options): Double = js.native
  def gender(): String = js.native
  def geohash(): String = js.native
  def geohash(opts: Options): String = js.native
  def google_analytics(): String = js.native
  def guid(): String = js.native
  def guid(options: Anon_4): String = js.native
  def hammertime(): Double = js.native
  def hash(): String = js.native
  def hash(opts: Options): String = js.native
  def hashtag(): String = js.native
  def hour(): Double = js.native
  def hour(opts: Options): Double = js.native
  def integer(): Double = js.native
  def integer(
    opts: AtLeastOneKey[
      IntegerOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in 'min' | 'max' ]: std.Pick<chance.Chance.IntegerOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): Double = js.native
  def ip(): String = js.native
  def ipv6(): String = js.native
  def klout(): String = js.native
  def last(): String = js.native
  def last(opts: LastNameOptions): String = js.native
  def latitude(): Double = js.native
  def latitude(opts: Options): Double = js.native
  def letter(): String = js.native
  def letter(opts: Options): String = js.native
  def locale(): String = js.native
  def locale(opts: Anon_Region): String = js.native
  def locales(): js.Array[String] = js.native
  def locales(opts: Anon_Region): js.Array[String] = js.native
  def longitude(): Double = js.native
  def longitude(opts: Options): Double = js.native
  def mersenne_twister(): js.Any = js.native
  def mersenne_twister(seed: Seed): js.Any = js.native
  def millisecond(): Double = js.native
  def minute(): Double = js.native
  def mixin(desc: MixinDescriptor): js.Any = js.native
  def month(): String = js.native
  def month(opts: Options): Month = js.native
   // API return type not defined in docs
  def months(): js.Array[Month] = js.native
  def n[T](generator: js.Function0[T], count: Double): js.Array[T] = js.native
  def n[T, O /* <: Options */](generator: js.Function1[/* options */ O, T], count: Double, options: O): js.Array[T] = js.native
  def name(): String = js.native
  def name(
    opts: AtLeastOneKey[
      NameOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof chance.Chance.NameOptions ]: std.Pick<chance.Chance.NameOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): String = js.native
  def name_prefix(): String = js.native
  def name_prefix(
    opts: AtLeastOneKey[
      PrefixOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof chance.Chance.PrefixOptions ]: std.Pick<chance.Chance.PrefixOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): String = js.native
  def name_prefixes(): js.Array[Name] = js.native
  def name_suffix(): String = js.native
  def name_suffix(opts: SuffixOptions): String = js.native
  def natural(): Double = js.native
  def natural(opts: Options): Double = js.native
  def normal(): Double = js.native
  def normal(opts: Options): Double = js.native
  def pad(num: Double, width: Double): String = js.native
  def pad(num: Double, width: Double, padChar: String): String = js.native
  // Text
  def paragraph(): String = js.native
  def paragraph(opts: Options): String = js.native
  def phone(): String = js.native
  def phone(opts: Options): String = js.native
  /**
    * @deprecated Use pickone
    */
  def pick[T](arr: js.Array[T]): T = js.native
  /**
    * @deprecated Use pickset
    */
  def pick[T](arr: js.Array[T], count: Double): js.Array[T] = js.native
  def pickone[T](arr: js.Array[T]): T = js.native
  def pickset[T](arr: js.Array[T]): js.Array[T] = js.native
  def pickset[T](arr: js.Array[T], count: Double): js.Array[T] = js.native
  def postal(): String = js.native
  def postcode(): String = js.native
  def prefix(): String = js.native
  def prefix(
    opts: AtLeastOneKey[
      PrefixOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof chance.Chance.PrefixOptions ]: std.Pick<chance.Chance.PrefixOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): String = js.native
  def profession(): String = js.native
  def profession(opts: Options): String = js.native
  def province(): String = js.native
  def province(opts: Options): String = js.native
  def provinces(): js.Array[Name] = js.native
  def radio(): String = js.native
  def radio(opts: Options): String = js.native
  def rpg(dice: String): js.Array[Double] | Double = js.native
  def rpg(dice: String, opts: Options): js.Array[Double] | Double = js.native
  @JSName("rpg")
  def rpg_Array(dice: String): js.Array[Double] = js.native
  def second(): Double = js.native
  def sentence(): String = js.native
  def sentence(
    opts: AtLeastOneKey[
      SentenceOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in 'words' | 'punctuation' ]: std.Pick<chance.Chance.SentenceOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): String = js.native
  def set[T](key: String, values: js.Array[T]): js.Any = js.native
  @JSName("set")
  def set_armedforces(key: armed_forces, values: js.Array[String]): js.Any = js.native
  @JSName("set")
  def set_cctypes(key: cc_types, values: js.Array[String]): js.Any = js.native
  @JSName("set")
  def set_currencytypes(key: currency_types, values: js.Array[String]): js.Any = js.native
  @JSName("set")
  def set_firstNames(key: firstNames, values: js.Array[String]): js.Any = js.native
  @JSName("set")
  def set_lastNames(key: lastNames, values: js.Array[String]): js.Any = js.native
  @JSName("set")
  def set_months(key: months, values: js.Array[String]): js.Any = js.native
  @JSName("set")
  def set_provinces(key: provinces, values: js.Array[String]): js.Any = js.native
  @JSName("set")
  def set_streetsuffixes(key: street_suffixes, values: js.Array[String]): js.Any = js.native
  @JSName("set")
  def set_territories(key: territories, values: js.Array[String]): js.Any = js.native
  @JSName("set")
  def set_usstatesanddc(key: us_states_and_dc, values: js.Array[String]): js.Any = js.native
  def shuffle[T](arr: js.Array[T]): js.Array[T] = js.native
  def ssn(): String = js.native
  def ssn(opts: Options): String = js.native
  def state(): String = js.native
  def state(opts: Options): String = js.native
  def states(): js.Array[Name] = js.native
  def street(): String = js.native
  def street(opts: Options): String = js.native
  def street_suffix(): Name = js.native
  def street_suffixes(): js.Array[Name] = js.native
  def string(): String = js.native
  def string(
    opts: AtLeastOneKey[
      StringOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof chance.Chance.StringOptions ]: std.Pick<chance.Chance.StringOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): String = js.native
  def suffix(): String = js.native
  def suffix(opts: SuffixOptions): String = js.native
  def syllable(): String = js.native
  def syllable(opts: Options): String = js.native
  def timestamp(): Double = js.native
  def timezone(): Timezone = js.native
  def tld(): String = js.native
  def tv(): String = js.native
  def tv(opts: Options): String = js.native
  def twitter(): String = js.native
  def unique[T](generator: js.Function0[T], count: Double): js.Array[T] = js.native
  def unique[T, O /* <: UniqueOptions[T] */](generator: js.Function1[/* options */ O, T], count: Double, options: O): js.Array[T] = js.native
  def url(): String = js.native
  def url(
    opts: AtLeastOneKey[
      UrlOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in 'protocol' | 'domain' | 'domain_prefix' | 'path' | 'extensions' ]: std.Pick<chance.Chance.UrlOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): String = js.native
  def weekday(opts: Options): Monday | Tuesday | Wednesday | Thursday | Friday | Saturday | Sunday = js.native
  def weighted[T](values: js.Array[T], weights: js.Array[Double]): T = js.native
  def word(): String = js.native
  def word(
    opts: AtLeastOneKey[
      WordOptions, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in 'length' | 'syllables' | 'capitalize' ]: std.Pick<chance.Chance.WordOptions, K>}
    */ typings.chance.chanceStrings.Chance with js.Any
    ]
  ): String = js.native
  def wp7_anid(): String = js.native
  def wp8_anid2(): String = js.native
  def year(): String = js.native
  def year(opts: Options): String = js.native
  def zip(): String = js.native
  def zip(opts: Options): String = js.native
}

